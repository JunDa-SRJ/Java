package com.itheima03;
/*
   需求：
      已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登陆之后，给出相应的提示
   思路：
       1.已知用户名和密码，定义两个字符串表示即可
       2.键盘录入要登录的用户名和密码，用Scanner实现
       3.拿键盘录入的用户名、密码和已知用户名和密码比较，给出相应的提示。字符串的比较用equals（）
       4.用循环实现多次机会，这里的次数明确，采用for循环，并在登陆成功的时候，使用break结束循环

 */

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String username = "itheima";
        String password = "cdzk";
        for (int i = 0; i < 3; i++) {
            //键盘录入要登录的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的用户名： ");
            String name = sc.nextLine();
            System.out.println("请输入你的密码： ");
            String psd = sc.nextLine();
            //拿键盘录入的用户名、密码和已知用户名和密码比较，给出相应的提示。字符串的比较用equals（）
            if (name.equals(username) && psd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的账户已被锁定，请与管理员联系");
                } else {
                    System.out.println("你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
