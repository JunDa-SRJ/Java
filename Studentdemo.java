package com.itheima03;
/*
    学生测试类
 */

public class Studentdemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用set方法给成员变量赋值
        s.setName("dajun");
        s.setAge(20);
        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "----" + s.getAge() );
    }
}
