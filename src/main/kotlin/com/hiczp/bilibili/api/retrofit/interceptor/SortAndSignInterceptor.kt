package com.hiczp.bilibili.api.retrofit.interceptor

import com.hiczp.bilibili.api.retrofit.Param
import com.hiczp.bilibili.api.retrofit.containsEncodedName
import com.hiczp.bilibili.api.retrofit.sortedRaw
import mu.KotlinLogging
import okhttp3.FormBody
import okhttp3.Interceptor
import okhttp3.Response
import java.security.MessageDigest

private val logger = KotlinLogging.logger {}

/**
 * 排序参数并添加签名
 * 必须保证在进入此拦截器前, 公共参数已被添加
 * 此拦截器将自动识别 appKey 在 Query 还是在 FormBody 并添加 sign 到相应位置
 *
 * @param appSecret 密钥
 */
class SortAndSignInterceptor(private val appSecret: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url()
        val body = request.body()

        request = when {
            //判断 appKey 是否在 Query 里
            url.queryParameter(Param.APP_KEY) != null -> {
                val sortedEncodedQuery = url.encodedQuery()!!
                        .split('&')
                        .sorted()
                        .joinToString(separator = "&")
                val sign = calculateSign(sortedEncodedQuery, appSecret)
                request.newBuilder()
                        .url(url.newBuilder()
                                .encodedQuery("$sortedEncodedQuery&${Param.SIGN}=$sign")
                                .build()
                        ).build()
            }

            //在 FormBody 里
            body is FormBody && body.containsEncodedName(Param.APP_KEY) -> {
                val sortedRaw = body.sortedRaw()
                val sign = calculateSign(sortedRaw, appSecret)
                val formBody = FormBody.Builder().apply {
                    sortedRaw.split('&').forEach {
                        val (name, value) = it.split('=')
                        addEncoded(name, value)
                    }
                    addEncoded(Param.SIGN, sign)
                }.build()
                request.newBuilder()
                        .method(request.method(), formBody)
                        .build()
            }

            //不存在 accessKey
            else -> {
                logger.error { "Fail to sign request because no ${Param.APP_KEY} found in request" }
                request
            }
        }

        return chain.proceed(request)
    }

    companion object {
        private val md5Instance = MessageDigest.getInstance("MD5")
        /**
         * 签名算法为 "$排序后的参数字符串$appSecret".md5()
         */
        private fun calculateSign(string: String, appSecret: String) =
                StringBuilder(32).apply {
                    //优化过的 md5 字符串生成算法
                    md5Instance.digest((string + appSecret).toByteArray()).forEach {
                        val value = it.toInt() and 0xFF
                        val high = value / 16
                        val low = value - high * 16
                        append(if (high <= 9) '0' + high else 'a' - 10 + high)
                        append(if (low <= 9) '0' + low else 'a' - 10 + low)
                    }
                }.toString()
    }
}
