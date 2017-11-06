package com.hiczp.bilibili.api.live.entity;

import com.google.gson.annotations.SerializedName;

public class FreeSilverAwardEntity {
    /**
     * code : 0
     * message : ok
     * data : {"surplus":-1039.6166666667,"silver":2426,"awardSilver":30,"isEnd":0}
     */

    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private DataEntity data;

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

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        /**
         * surplus : -1039.6166666667
         * silver : 2426
         * awardSilver : 30
         * isEnd : 0
         */

        @SerializedName("surplus")
        private double surplus;
        @SerializedName("silver")
        private int silver;
        @SerializedName("awardSilver")
        private int awardSilver;
        @SerializedName("isEnd")
        private int isEnd;

        public double getSurplus() {
            return surplus;
        }

        public void setSurplus(double surplus) {
            this.surplus = surplus;
        }

        public int getSilver() {
            return silver;
        }

        public void setSilver(int silver) {
            this.silver = silver;
        }

        public int getAwardSilver() {
            return awardSilver;
        }

        public void setAwardSilver(int awardSilver) {
            this.awardSilver = awardSilver;
        }

        public int getIsEnd() {
            return isEnd;
        }

        public void setIsEnd(int isEnd) {
            this.isEnd = isEnd;
        }
    }
}
