package com.itheima05;

public class newphone extends phone{
  /*  public void call(String name){
        System.out.println("开启视频功能");

        // System.out.println("给" + name + "打电话");
           super.call(name);
    }*/



/*
@Override
  是一个注解
  可以帮助我们检查重写方法的方法声明的正确性

  方法重写概述：
      子类中出现了和父类一摸一样的方法声明
  子类重写的应用：
      当子类需要父类的功能时，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了父类
      的功能，又定义了子类特有的内容



 */

@Override
    public void call(String name){

        System.out.println("开启视频功能");

        // System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
