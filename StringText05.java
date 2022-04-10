package com.itheima03;
/*
需求：
   定义一个方法，实现字符串的反转。从键盘录入一个字符串，调用该方法后，并在控制台输出
   例如：键盘录入 abc，输出结果 cba；
思路：
    1.键盘录入一个字符串，用Scanner实现
    2.定义一个方法，用字符串反转。返回值类型String，参数 String s
    3.在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
    4.调用方法
    5.输出结果
 */

import java.util.Scanner;

public class StringText05 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的字符串： ");
        String line = sc.nextLine();
        //调用方法
        String sss = reverse(line);
        //输出结果
        System.out.println(sss);
    }
    //定义一个方法，用字符串反转。返回值类型String，参数 String s
public static String reverse(String s){
        String ss = "";
        //在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        for(int i = s.length()-1;i>=0;i--){
           ss += s.charAt(i);

        }

return ss;
}
}
