package com.itheima03;
/*
   ArrayList常用方法：
       public boolean remove（Object o）：删除指定元素，返回删除是否成功
       public E remove（int index）：删除指定索引处的元素，返回被删除的元素
       public E set（int index ， E element）：修改指定索引处的元素，返回被修改的元素
       public E get（int index）：返回指定索引处的元素
       public int size（）：返回集合中的元素

 */

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //public boolean remove（Object o）：删除指定元素，返回删除是否成功
        //System.out.println(array.remove("hello"));
        //System.out.println(array.remove("javase"));

        // public E remove（int index）：删除指定索引处的元素，返回被删除的元素
        //System.out.println(array.remove(1));
        //System.out.println(array.remove(3));

        //public E set（int index ， E element）：修改指定索引处的元素，返回被修改的元素
        //System.out.println(array.set(1,"javase"));

        //public E get（int index）：返回指定索引处的元素
        //System.out.println(array.get(1));
        //System.out.println(array.get(0));
        //System.out.println(array.get(2));
        //System.out.println(array.get(3));

        //public int size（）：返回集合中的元素
        System.out.println(array.size() );

        //输出集合
        System.out.println("array: "+ array);
    }
}
