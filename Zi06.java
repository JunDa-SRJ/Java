package com.itheima05;
/*
      方法重写注意事项
      1.私有方法不能被重写（父类私有成员子类是不能继承的）
      2.子类方法访问权限不能更低（public > 默认 > 私有）

 */

public class Zi06 extends Fu06 {

    /*@Override
    private void show(){
        System.out.println("Zi中show()方法被调用");
    }*/


    /*@Override
    public void method() {
        System.out.println("Zi中method()方法被调用");
    }*/

    @Override
    void method() {
        System.out.println("Zi中method()方法被调用");

    }
}