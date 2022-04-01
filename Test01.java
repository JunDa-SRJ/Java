package com.itheima02;
/*
   需求：输入星期数，显示今天的减肥运动
       周一：跑步
       周二：游泳
       周三：慢走
       周四：动感单车
       周五：拳击
       周六：爬山
       周日：好好吃一顿

     思路：
       1.键盘录入一个星期数，用一个变量接收
       2.对星期数进行判断，这里用if语句实现
       3.在对应的语句控制中输出对应的减肥活动
 */

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字： ");
        int day = sc.nextInt();

        if (day == 1) {
            System.out.println("跑步");
        } else if (day == 2) {
            System.out.println("游泳");
        } else if (day == 3) {
            System.out.println("慢走");
        } else if (day == 4) {
            System.out.println("动感单车");
        } else if (day == 5) {
            System.out.println("拳击");
        } else if (day == 6) {
            System.out.println("爬山");
        }
        if (day == 7) {
            System.out.println("好好吃一顿");
        } else {
            System.out.println("你输入的数字有误");
        }

    }


}
