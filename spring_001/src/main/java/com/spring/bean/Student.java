package com.spring.bean;

public class Student {

    private String stuNo;
    private String stuName;

    public Student(String stuNo, String stuName, Cat cat) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.cat = cat;
    }

    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public Student() {
    }

    public String getStuNo() {

        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    /*
        1、如何不应用框架对bean进行管理，则需要调用者手动创建再进行使用
            (1)写main方法
            (2)编写单元测试
     */
}
