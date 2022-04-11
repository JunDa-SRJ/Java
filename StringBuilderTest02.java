package com.itheima03;
/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如：键盘录入abc，输出结果cba
    思路：
        1.键盘录入一个字符串，用Scanner 实现
        2.定义一个方法，实现字符串反转。返回值的类型 String ，参数 String s
        3.在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        4.调用方法
        5.输出结果

 */



import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String line = sc.nextLine();
        //调用方法
        String s = reverse(line);
        //输出结果
        System.out.println(s);
    }
    //定义一个方法，实现字符串反转。返回值的类型 String ，参数 String s
    public static String reverse(String s){
    /*    StringBuilder sb = new StringBuilder(s);
         sb.reverse();
         String ss = sb.toString();
         return ss;

     */


        //等价于一行代码
      return   new StringBuilder(s).reverse().toString();
    }
}
