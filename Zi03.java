package com.itheima05;
/*
   this:代表本类对象的引用
   super：代表父类存储空间的标识（可以理解为父类对象引用）
 */

public class Zi03 extends Fu03{
    public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);
        //我要访问本类的成员变量age，怎么办呢？
        System.out.println(this.age);
        //我要访问父类的成员变量age，怎么办呢？
        System.out.println(super.age);
    }
}
