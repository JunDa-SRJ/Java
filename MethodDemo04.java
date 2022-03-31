package com.itheima;
/*
   方法注意事项：
       方法不能嵌套定义
       void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
 */

public class MethodDemo04 {
    public static void main(String[] args) {

    }
   public static  void methodOne(){
       public static  void methodTwo(){

       }
   }
    public static  void methodThree(){
             return ;//代码到这结束不再继续下去
        System.out.println();//读不到
    }
}
