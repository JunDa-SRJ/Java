package com.itheima04;
/*
  前提：
      存在一个类或者接口
      这里的类可以是具体类也可以是抽象类
  格式：
      new 类名或者接口名（）{
            重写方法；
            };
  本质：
      是一个继承了该类或者实现了该接口的子类匿名对象

 */

public class Outer03 {

   /* public void mothed(){
      new Inter(){
          @Override
          public void show() {
              System.out.println("匿名内部类");
          }
      };

      show();*/

  /*  public void mothed(){
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        */
      //实现多次

        public void mothed(){
         Inter i = new Inter(){
                @Override
                public void show() {
                    System.out.println("匿名内部类");
                }
            };

         i.show();
         i.show();

    }
}
