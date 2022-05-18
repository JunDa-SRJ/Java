package com.itheima01;

import java.util.Objects;

public class Student02 {
    private String name;
    private int age;

    public Student02() {
    }

    public Student02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //  this --- s1
        //  o --- s2
        //比较地址是否相同，如果相同，直接返回true
        if (this == o) return true;
        //判断参数是否为null
        //判断两个参数是否来自于同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型   student = s2;
        Student02 student02 = (Student02) o;
        //比较年龄
        if (age != student02.age) return false;
        //比较姓名
        return Objects.equals(name, student02.name);
    }


}
