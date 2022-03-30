package com.itheima;
/*
   获取最值
        获取数组中的最大值
        最小值同学们自己完成
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,64,55,33,45};
        //定义一个变量，用于保存最大值
        //取数组中第一个数据作为变量的初始值
        int max = arr[0];
        //与数组中剩余的数据逐个对比，每次对比将最大值保存到变量中去
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] > max){

                max = arr[i];

            }
        }
        //循环结束后打印变量的值
        System.out.println(max);
    }
}
