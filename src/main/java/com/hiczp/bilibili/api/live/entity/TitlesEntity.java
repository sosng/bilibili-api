package com.hiczp.bilibili.api.live.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TitlesEntity {
    /**
     * code : 0
     * message : ok
     * data : [{"id":"task-color","title":"姹紫嫣红成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-color.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-year","title":"度年如日成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-year.png?20171102172700","width":186,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-winder","title":"追云逐月成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-winder.png?20171102172700","width":191,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-ul-max","title":"方得始终成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-ul-max.png?20171102172700","width":194,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-up-max","title":"久负盛名成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-up-max.png?20171102172700","width":190,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-tv-king","title":"电视王成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-tv-king.png?20171102172700","width":165,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"task-rich-man","title":"富甲天下成就","img":"http://static.hdslb.com/live-static/live-app/title/3/task-rich-man.png?20171102172700","width":156,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"christmas-top1","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/christmas-top1.png?20171102172700","width":198,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"christmas-top2","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/christmas-top2.png?20171102172700","width":198,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"old-man","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/old-man.png?20171102172700","width":135,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"middle-man","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/middle-man.png?20171102172700","width":164,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"youth-man","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/youth-man.png?20171102172700","width":133,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"child-man","title":"2015年圣诞节","img":"http://static.hdslb.com/live-static/live-app/title/3/child-man.png?20171102172700","width":166,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"festival-top1","title":"春节年糕活动","img":"http://static.hdslb.com/live-static/live-app/title/3/festival-top1.png?20171102172700","width":183,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"festival-top2","title":"春节年糕活动","img":"http://static.hdslb.com/live-static/live-app/title/3/festival-top2.png?20171102172700","width":169,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"cake-dough","title":"春节年糕活动","img":"http://static.hdslb.com/live-static/live-app/title/3/cake-dough.png?20171102172700","width":185,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"cake-flour","title":"春节年糕活动","img":"http://static.hdslb.com/live-static/live-app/title/3/cake-flour.png?20171102172700","width":183,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"carnival-top","title":"冬季嘉年华","img":"http://static.hdslb.com/live-static/live-app/title/3/carnival-top.png?20171102172700","width":177,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"school-top1","title":"保卫学园计划","img":"http://static.hdslb.com/live-static/live-app/title/3/school-top1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"school-top2","title":"保卫学园计划","img":"http://static.hdslb.com/live-static/live-app/title/3/school-top2.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"school-top3","title":"保卫学园计划","img":"http://static.hdslb.com/live-static/live-app/title/3/school-top3.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"school-top4","title":"保卫学园计划","img":"http://static.hdslb.com/live-static/live-app/title/3/school-top4.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"school-top5","title":"保卫学园计划","img":"http://static.hdslb.com/live-static/live-app/title/3/school-top5.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-1","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-2","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-2.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-3","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-3.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-4","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-4.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-5","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-5.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sing-1","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sing-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sing-2","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sing-2.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sing-3","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sing-3.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sing-4","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sing-4.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sing-5","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/sing-5.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"warrior-1","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/warrior-1.png?20171102172700","width":193,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"warrior-2","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/warrior-2.png?20171102172700","width":195,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"warrior-3","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/warrior-3.png?20171102172700","width":191,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"warrior-4","title":"唱见甜心召集令","img":"http://static.hdslb.com/live-static/live-app/title/3/warrior-4.png?20171102172700","width":192,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sign-one-month","title":"签到全勤奖励","img":"http://static.hdslb.com/live-static/live-app/title/3/sign-one-month.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"may-spinach","title":"五月病活动","img":"http://static.hdslb.com/live-static/live-app/title/3/may-spinach.png?20171102172700","width":161,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"may-pillow","title":"五月病活动","img":"http://static.hdslb.com/live-static/live-app/title/3/may-pillow.png?20171102172700","width":161,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"may-high","title":"五月病活动","img":"http://static.hdslb.com/live-static/live-app/title/3/may-high.png?20171102172700","width":185,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"may-sleep","title":"五月病活动","img":"http://static.hdslb.com/live-static/live-app/title/3/may-sleep.png?20171102172700","width":185,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"xiaomi","title":"小米MAX活动","img":"http://static.hdslb.com/live-static/live-app/title/3/xiaomi.png?20171102172700","width":174,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"salty","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/salty.png?20171102172700","width":160,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"salty-man","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/salty-man.png?20171102172700","width":197,"height":50,"is_lihui":1,"lihui_img":"http://static.hdslb.com/live-static/live-app/titlie_lihui/3/salty-man.png?20171102172700","lihui_width":400,"lihui_height":564},{"id":"salty-king","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/salty-king.png?20171102172700","width":192,"height":50,"is_lihui":1,"lihui_img":"http://static.hdslb.com/live-static/live-app/titlie_lihui/3/salty-king.png?20171102172700","lihui_width":400,"lihui_height":564},{"id":"salty-sweet","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/salty-sweet.png?20171102172700","width":197,"height":50,"is_lihui":1,"lihui_img":"http://static.hdslb.com/live-static/live-app/titlie_lihui/3/salty-sweet.png?20171102172700","lihui_width":400,"lihui_height":564},{"id":"sweet","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet.png?20171102172700","width":160,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"sweet-fighter","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-fighter.png?20171102172700","width":197,"height":50,"is_lihui":1,"lihui_img":"http://static.hdslb.com/live-static/live-app/titlie_lihui/3/sweet-fighter.png?20171102172700","lihui_width":400,"lihui_height":564},{"id":"sweet-princess","title":"2016年端午节","img":"http://static.hdslb.com/live-static/live-app/title/3/sweet-princess.png?20171102172700","width":192,"height":50,"is_lihui":1,"lihui_img":"http://static.hdslb.com/live-static/live-app/titlie_lihui/3/sweet-princess.png?20171102172700","lihui_width":400,"lihui_height":564},{"id":"anniversary","title":"七周年活动","img":"http://static.hdslb.com/live-static/live-app/title/3/anniversary.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"ice-dust","title":"2016夏色活动","img":"http://static.hdslb.com/live-static/live-app/title/3/ice-dust.png?20171102172700","width":192,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"ice-zero","title":"2016夏色活动","img":"http://static.hdslb.com/live-static/live-app/title/3/ice-zero.png?20171102172700","width":192,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"da-shen","title":"绘画招募活动","img":"http://static.hdslb.com/live-static/live-app/title/3/da-shen.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"gao-shou","title":"绘画招募活动","img":"http://static.hdslb.com/live-static/live-app/title/3/gao-shou.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"shen-7","title":"绘画招募活动","img":"http://static.hdslb.com/live-static/live-app/title/3/shen-7.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"nuan-xin","title":"绘画招募活动","img":"http://static.hdslb.com/live-static/live-app/title/3/nuan-xin.png?20171102172700","width":187,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"tao-lu","title":"橙光活动","img":"http://static.hdslb.com/live-static/live-app/title/3/tao-lu.png?20171102172700","width":198,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-56-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-56-1.png?20171102172700","width":170,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-56-2","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-56-2.png?20171102172700","width":190,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-56-3","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-56-3.png?20171102172700","width":190,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-56-4","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-56-4.png?20171102172700","width":163,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-57-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-57-1.png?20171102172700","width":150,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-58-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-58-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-59-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-59-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-60-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-60-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-61-1","title":"2016吃瓜活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-61-1.png?20171102172700","width":185,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-62-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-62-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-63-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-63-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-64-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-64-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-65-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-65-1.png?20171102172700","width":95,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-66-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-66-1.png?20171102172700","width":95,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-67-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-67-1.png?20171102172700","width":95,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-68-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-68-1.png?20171102172700","width":95,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-69-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-69-1.png?20171102172700","width":95,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-70-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-70-1.png?20171102172700","width":124,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-71-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-71-1.png?20171102172700","width":124,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-72-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-72-1.png?20171102172700","width":124,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-73-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-73-1.png?20171102172700","width":124,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-74-1","title":"2016拜年祭主播选拔活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-74-1.png?20171102172700","width":124,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-75-1","title":"2016深空远征活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-75-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-75-2","title":"2016深空远征活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-75-2.png?20171102172700","width":186,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-75-3","title":"2016深空远征活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-75-3.png?20171102172700","width":190,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-76-1","title":"2016深空远征活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-76-1.png?20171102172700","width":104,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-77-1","title":"2016红叶祭活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-77-1.png?20171102172700","width":185,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-78-1","title":"2016双11活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-78-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-79-1","title":"2016双11活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-79-1.png?20171102172700","width":190,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-80-1","title":"Last Order活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-80-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-81-1","title":"Last Order活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-81-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-82-1","title":"Last Order活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-82-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-82-2","title":"Last Order活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-82-2.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-82-3","title":"Last Order活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-82-3.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-83-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-83-1.png?20171102172700","width":103,"height":49,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-84-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-84-1.png?20171102172700","width":143,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-85-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-85-1.png?20171102172700","width":118,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-86-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-86-1.png?20171102172700","width":107,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-87-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-87-1.png?20171102172700","width":107,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-88-1","title":"2016年度回馈活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-88-1.png?20171102172700","width":111,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-89-1","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-89-1.png?20171102172700","width":103,"height":49,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-89-2","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-89-2-2.png?20171102172700","width":103,"height":49,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-89-2-2","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-89-2-2.png?20171102172700","width":105,"height":49,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-90-1","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-90-1.png?20171102172700","width":156,"height":43,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-91-1","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-91-1.png?20171102172700","width":139,"height":44,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-92-1","title":"丁酉年春节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-92-1.png?20171102172700","width":129,"height":41,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-93-1","title":"2017情人节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-93-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-94-1","title":"2017情人节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-94-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-95-1","title":"2017情人节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-95-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-95-2","title":"2017情人节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-95-2.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-96-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-96-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-97-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-97-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-98-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-98-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-99-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-99-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-100-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-100-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-101-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-101-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-102-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-102-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-103-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-103-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-104-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-104-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-105-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-105-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-106-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-106-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-107-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-107-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-108-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-108-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-108-2","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-108-2.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-109-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-109-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-110-1","title":"2017超次元文明演武","img":"http://static.hdslb.com/live-static/live-app/title/3/title-110-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-111-1","title":"2017Blink","img":"http://static.hdslb.com/live-static/live-app/title/3/title-111-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-112-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-112-1.png?20171102172700","width":192,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-113-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-113-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-114-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-114-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-115-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-115-1.png?20171102172700","width":180,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-116-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-116-1.png?20171102172700","width":193,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-117-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-117-1.png?20171102172700","width":195,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-118-1","title":"新主播招募","img":"http://static.hdslb.com/live-static/live-app/title/3/title-118-1.png?20171102172700","width":191,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-119-1","title":"2017排行榜","img":"http://static.hdslb.com/live-static/live-app/title/3/title-119-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-120-1","title":"友爱社头衔","img":"http://static.hdslb.com/live-static/live-app/title/3/title-120-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-121-1","title":"友爱社头衔","img":"http://static.hdslb.com/live-static/live-app/title/3/title-121-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-122-1","title":"友爱社头衔","img":"http://static.hdslb.com/live-static/live-app/title/3/title-122-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-123-1","title":"友爱社头衔","img":"http://static.hdslb.com/live-static/live-app/title/3/title-123-1.png?20171102172700","width":194,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-123-2","title":"友爱社头衔","img":"http://static.hdslb.com/live-static/live-app/title/3/title-123-2.png?20171102172700","width":191,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-124-1","title":"儿童节活动","img":"http://static.hdslb.com/live-static/live-app/title/3/title-124-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-125-1","title":"聊天概率掉落","img":"http://static.hdslb.com/live-static/live-app/title/3/title-125-1.png?20171102172700","width":196,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-126-1","title":"夏日大作战","img":"http://static.hdslb.com/live-static/live-app/title/3/title-126-1.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-126-2","title":"夏日大作战","img":"http://static.hdslb.com/live-static/live-app/title/3/title-126-2.png?20171102172700","width":200,"height":50,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-127-1","title":"开学季","img":"http://static.hdslb.com/live-static/live-app/title/3/title-127-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-127-2","title":"开学季","img":"http://static.hdslb.com/live-static/live-app/title/3/title-127-2.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-128-1","title":"国庆","img":"http://static.hdslb.com/live-static/live-app/title/3/title-128-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-128-2","title":"国庆","img":"http://static.hdslb.com/live-static/live-app/title/3/title-128-2.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-129-1","title":"中秋节","img":"http://static.hdslb.com/live-static/live-app/title/3/title-129-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-130-1","title":"中秋节","img":"http://static.hdslb.com/live-static/live-app/title/3/title-130-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-131-1","title":"哔哩谷物语","img":"http://static.hdslb.com/live-static/live-app/title/3/title-131-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-131-2","title":"哔哩谷物语","img":"http://static.hdslb.com/live-static/live-app/title/3/title-131-2.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0},{"id":"title-133-1","title":"秋叶祭","img":"http://static.hdslb.com/live-static/live-app/title/3/title-133-1.png?20171102172700","width":68,"height":20,"is_lihui":0,"lihui_img":"","lihui_width":0,"lihui_height":0}]
     */

    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataEntity> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {
        /**
         * id : task-color
         * title : 姹紫嫣红成就
         * img : http://static.hdslb.com/live-static/live-app/title/3/task-color.png?20171102172700
         * width : 200
         * height : 50
         * is_lihui : 0
         * lihui_img :
         * lihui_width : 0
         * lihui_height : 0
         */

        @SerializedName("id")
        private String id;
        @SerializedName("title")
        private String title;
        @SerializedName("img")
        private String img;
        @SerializedName("width")
        private int width;
        @SerializedName("height")
        private int height;
        @SerializedName("is_lihui")
        private int isLihui;
        @SerializedName("lihui_img")
        private String lihuiImg;
        @SerializedName("lihui_width")
        private int lihuiWidth;
        @SerializedName("lihui_height")
        private int lihuiHeight;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getIsLihui() {
            return isLihui;
        }

        public void setIsLihui(int isLihui) {
            this.isLihui = isLihui;
        }

        public String getLihuiImg() {
            return lihuiImg;
        }

        public void setLihuiImg(String lihuiImg) {
            this.lihuiImg = lihuiImg;
        }

        public int getLihuiWidth() {
            return lihuiWidth;
        }

        public void setLihuiWidth(int lihuiWidth) {
            this.lihuiWidth = lihuiWidth;
        }

        public int getLihuiHeight() {
            return lihuiHeight;
        }

        public void setLihuiHeight(int lihuiHeight) {
            this.lihuiHeight = lihuiHeight;
        }
    }
}
