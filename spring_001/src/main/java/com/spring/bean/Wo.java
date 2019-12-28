package com.spring.bean;

public class Wo {
    private String woNo;
    private String woName;

    public Wo(String woNo, String woName) {
        this.woNo = woNo;
        this.woName = woName;
    }

    public Wo() {

    }

    @Override
    public String toString() {
        return "Wo{" +
                "woNo='" + woNo + '\'' +
                ", woName='" + woName + '\'' +
                '}';
    }

    public String getWoNo() {
        return woNo;
    }

    public void setWoNo(String woNo) {
        this.woNo = woNo;
    }

    public String getWoName() {
        return woName;
    }

    public void setWoName(String woName) {
        this.woName = woName;
    }
}
