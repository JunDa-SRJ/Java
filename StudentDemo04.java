package com.itheima02;
/*
   学生测试类
 */

public class StudentDemo04 {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //给成员变量赋值
        s.name = "jun";
      //  s.age = -30;
      //  s.age = -0;
        //s.setAge(30);
        s.setAge(-30);

        //调用show方法
        s.show();
    }
}
