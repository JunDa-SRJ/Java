package com.itheima03;
/*
   需求：
      创建一个存储学生对象的集合，存储三个学生对象，使用程序控制实现在控制台遍历该集合
   思路：
      1.定义学生类，为了键盘录入方便，把学生类中的成员变量都定义为String类型
      2.创建集合对象
      3.键盘录入学生对象的数据
      4.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
      5.在集合中添加学生对象
      6.遍历集合，采用通用遍历格式实现
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
//        //键盘录入学生对象的数据
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生的姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入学生的年龄：");
//        String age = sc.nextLine();
//        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//        Student s = new Student();
//        s.setName(name);
//        s.setAge(age);
//        //在集合中添加学生对象
//        array.add(s);

        //为了提高代码的复用性，我们用方法来改进程序
//        addStudent(array);
//        addStudent(array);
//        addStudent(array);


        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }


    }

    public static void addStudent(ArrayList<String> array) {

        //键盘录入学生对象的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
       // s.setAge(age);
        //在集合中添加学生对象
     //   array.add(s);
    }
}
