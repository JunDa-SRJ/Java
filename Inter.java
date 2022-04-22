package com.itheima01;
/*
     接口的成员特点
     1.成员变量：
        只能是常量
        默认修饰符：public static final
     2.构造方法
         接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在的
         一个类如果没有父类，默认继承自Object类
     3.成员方法
         只能是抽象方法
         默认修饰符：public abstract
         关于接口中的方法，JDK8和JDK9中有一些新特性，后面在讲解

 */

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    //public static final int num3 = 30;

    //public Inter(){}

//    public void show(){}

   public abstract void method();
  void show();
}
