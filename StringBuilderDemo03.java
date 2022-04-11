package com.itheima03;
/*
   StringBuilder 转换为 String
     public String toString（）：通过toString（）就可以实现StringBuilder转换为String

   String 转换为 StringBuilder
     public StringBuilder（String s）：通过构造自己的方法就可以实现把String 转换为StringBuilder
 */

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);

        // String 转换为 StringBuilder
        String s1 = "hello";
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(s1);
    }
}
