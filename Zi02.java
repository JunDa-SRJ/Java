package com.itheima05;
/*
     (输出一个值，先看方法中有无，再看本类中有无，最后再找父类)
     例如： age
     在子类方法中询问一个变量：
        1.子类局部范围找
        2.子类成员范围找
        3.父类成员范围找
        4.如果都没有就报错（不考虑父亲的父亲）
 */
public class Zi02 extends Fu02{
    //身高
   public int height = 185;
    //年龄
   public int age = 20;

    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //报错
    //    System.out.println(weight);
    }
}
