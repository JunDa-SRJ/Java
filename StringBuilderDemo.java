package com.itheima03;
/*
    StringBuilder构造方法：
          public StringBuilder():创建一个空白可变字符串对象，不含有任何反应
          public StringBuilder(String str):根据字符串的内容，来创建可变字符串对象
 */

public class StringBuilderDemo {
    public static void main(String[] args) {
      //public StringBuilder():创建一个空白可变字符串对象，不含有任何反应
        StringBuilder  sb = new StringBuilder();
        System.out.println("sb: "+ sb);
        System.out.println(sb.length());

     //  public StringBuilder(String str):根据字符串的内容，来创建可变字
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2: "+ sb2);
        System.out.println(sb2.length());
    }
}
