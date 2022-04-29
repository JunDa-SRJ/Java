package com.itheima04;

public class Outer02 {

    private int num = 10;
/*    局部内部类
   局部内部类是在方法中定义类，所以外界是无法直接使用的，需要在方法内部创建对象并使用
   该类可以直接访问外部类的成员，也可以访问方法内部的局部变量

  */
public void method(){
        int num2 = 20;
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner i = new Inner();
        i.show();

    }
}
