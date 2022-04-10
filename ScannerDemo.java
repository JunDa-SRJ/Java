package com.itheima03;
/*
  Scanner：
     用于获取键盘录入数据。（基本数据类型，字符串类型）
  public String nextline（）：
     获取键盘录入字符串数据

 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");

        String line = sc.nextLine();

        System.out.println("你输入的数据是： "+ line);
    }


}
