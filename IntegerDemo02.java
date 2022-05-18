package com.itheima01;
/*
       构造方法：
        public Integer（int value）：根据 int 值创建 Integer 对象（过时）
        public Integer（String s）：根据String 值创建 Integer 对象（过时）

       静态方法获取对象：
        public static Integer valueOf（int value）：返回表示指定的 int 值的 Integer实例
        public static Integer valueOf（String s）：返回一个保存指定值的 Integer对象 String

 */

public class IntegerDemo02 {
    public static void main(String[] args) {
            Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("100");
       // Integer i2 = new Integer("100");//NumberFormatException
        System.out.println(i2);

        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("100");
        //Integer i4 = Integer.valueOf("abc");
        System.out.println(i4);
    }
}
