package com.itheima01;
/*
   接口的特点：
       1.接口用关键字interface修饰
           public interface 接口名{}
       2.类实现接口用implements表示
           public class 类名 implements 接口名{}
       3.接口不能实例化
           接口如何实现实例化呢？参照多态的方式，通过实现类对象，通过实现类对象实例化，这叫接口多态
       4.接口的实现类
           要么重写接口中的所有抽象方法
           要么是抽象类
 */

public interface Jumpping {

    public abstract  void jump();
}
