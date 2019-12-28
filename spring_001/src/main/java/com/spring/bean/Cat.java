package com.spring.bean;

public class Cat {
    private String catNo;
    private String catName;

    private Wo wo;

    public Cat(String catNo, String catName, Wo wo) {
        this.catNo = catNo;
        this.catName = catName;
        this.wo = wo;
    }

    public Wo getWo() {
        return wo;
    }

    public void setWo(Wo wo) {
        this.wo = wo;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catNo='" + catNo + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }

    public String getCatNo() {
        return catNo;
    }

    public void setCatNo(String catNo) {
        this.catNo = catNo;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
