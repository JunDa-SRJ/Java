package com.itheima;

/*
   数组中常见的两个问题

   索引越界：访问了数组中不存在的索引对应的元素，造成索引问题
          ArrayIndexOutofBoundsException

   空指针异常：访问的数组已经不再指向堆内存的数据，造成空指针异常

   null：空值，引用数据类型的默认值，表示不指向任何有效对象

 */
public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[3]);

        arr = null;
        System.out.println(arr[0]);
    }



}
