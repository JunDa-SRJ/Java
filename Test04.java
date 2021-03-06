package com.itheima02;
/*
   需求：有一对兔子，从出生后第3个月起每个月都生一队兔子，小兔子长到第三个月后每个月又生一对兔子
       假如，兔子都不死，问第二十个月的兔子对数是多少？
   思路：
       1.为了存储多个月的兔子对数，定义一个数组。用动态初始化完成数组元素的初始化，长度为20
       2.因为第1个月，第2个月兔子的对数是已知的，都是1,所以，数组的第一个元素，第二个元素的值都是1
       3.用循环实现计算每个月的兔子对数
       4.输出数组中最后一个元素的值，就是第20个月的兔子对数

 */

public class Test04 {
    public static void main(String[] args) {
        // 为了存储多个月的兔子对数，定义一个数组。用动态初始化完成数组元素的初始化，长度为20
        int[] arr = new int[20];
        //因为第1个月，第2个月兔子的对数是已知的，都是1,所以，数组的第一个元素，第二个元素的值都是1
        arr[0] = 1;
        arr[1] = 1;

        //    arr[2] = arr[0] + arr[1];
        //  arr[3] = arr[1] + arr[2];
        //arr[4] = arr[2] + arr[3];

        // 用循环实现计算每个月的兔子对数
        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        // 输出数组中最后一个元素的值，就是第20个月的兔子对数
        System.out.println("第十二个月兔子的对数是： " + arr[19]);
    }
}
