package com.itheima02;
/*
   查看循环求偶数和的执行流程
 */

public class DebugTest {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //循环求偶数和
        for(int i = 0;i <=10;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        //输出结果
        System.out.println("sum: " + sum);
    }
}
