package com.itheima02;
/*
    需求：
       在编程竞赛中，有6个评委参与打分，分数为0-100的整数分。
       选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）
    思路：
       1.定义一个数组，用动态初始化完成数组元素的初始化，长度为6
       2.键盘录入评委分数
       3.由于是6个评委打分，所以，接收评委分数的操作，用于循环改进
       4.定义方法实现获取数组中的最高分（数组最大值），调用方法
       5.定义方法实现获取数组中的最低分（数组最小值），调用方法
       6.定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
       7.按照计算规则进行计算得到平均分
       8.输出平均分

    */

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
//定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
   /*     System.out.println("请输入第一个评委的打分: ");

        arr[0]  = sc.nextInt();
        System.out.println("请输入第二个评委的打分: ");

        arr[1]  = sc.nextInt();
        */

        //键盘录入评委分数
        for(int i = 0;i < arr.length;i++){
            System.out.println("第" + (i+1) +"个评委的分数为： ");

            arr[i] = sc.nextInt();
        }
      int max =   getMax(arr);

        int min = getMin(arr);
        int sum = getSum(arr);
    //按照计算规则进行计算得到平均分,输出平均分
        int aver = (sum - max - min) / (arr.length - 2);
        System.out.println(aver);
    }

   //定义方法实现获取数组中的最高分（数组最大值），调用方法
    public static  int getMax(int[] arr){
             int max = arr[0];
             for(int i = 0;i < arr.length;i++){
                 if(max < arr[i]){
                     max = arr[i];
                 }
             }
             return max;
    }

    //定义方法实现获取数组中的最低分（数组最小值），调用方法
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    //定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
