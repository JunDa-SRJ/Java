package com.itheima04;
/*
   学生类
   Alt + Insert/鼠标右键Generate
 */

public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;
    public Student(){}

    public Student(String sid,String name,String age,String address)
    {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setSid(String sid){
        this.sid = sid;
    }
    public  String getsid(){
        return sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(String age) {
        this.age = age;
    }


    public String getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


}
