package com.itheima01;
/*
    Arrays 类包含用于操作数组的各种方法

    public static String toString(int[] a):返回指定数组的内容的字符串表示形式
    public static void sort (int[] a):按照数字顺序排列指定数组

 */

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {13,69,80,57,19};

        System.out.println("排序前: "+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后: "+ Arrays.toString(arr));


    }

}