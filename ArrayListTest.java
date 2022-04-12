package com.itheima03;
/*
   需求：
       创建一个存储字符串的集合，存储3个字符串元素，使用程序现在控制台遍历该集合
   思路：
       1.创建集合
       2.在集合中添加字符串元素
       3.遍历集合，首先要能够获取集合中的每一个元素，这个通过get（int index）方法实现
       4.遍历集合，其次要能够获取到集合的长度，这个通过size（）方法实现
       5.遍历集合的通用格式
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
//创建集合
        ArrayList<String> array = new ArrayList<>();
//在集合中添加字符串元素
        array.add("xiao");
        array.add("da");
        array.add("jun");
//遍历集合，首先要能够获取集合中的每一个元素，这个通过get（int index）方法实现
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));
// 遍历集合，其次要能够获取到集合的长度，这个通过size（）方法实现
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
