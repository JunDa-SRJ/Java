package com.itheima;
/*
   一个数组
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //定义一个数组
        int[] array = new int[3];

        //输出数组名及元素
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //给数组中的元素赋值
        array[1] = 100;
        array[2] = 200;
        //再次输出数组名及元素
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
