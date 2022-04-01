package com.itheima02;
/*
  查看方法调用的执行流程
 */

import java.util.Scanner;

public class DebugTest02 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接受数据
        System.out.println("请输入第一个数： ");
        int a = sc.nextInt();
        System.out.println("请输入第二个数: ");
        int b = sc.nextInt();
        //调用方法
        int max = getMax(a,b);

        //输出结果
        System.out.println("max: " + max);
    }
    //获取两个数的较大值
     public static int getMax(int a,int b){
        int number = a>b?a:b;
        return number;
     }
}
