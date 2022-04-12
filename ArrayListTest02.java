package com.itheima03;
/*
  需求：
      创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历集合
  思路：
      1.定义学生类
      2.创建集合对象
      3.创建学生对象
      4.添加学生对象到集合中去
      5.遍历集合，采用通用遍历格式实现
 */


import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("da,jun", 10);
        Student s2 = new Student("xiaojun", 9);
        Student s3 = new Student("shijun", 20);
        //添加学生对象到集合中去
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }


    }
}
