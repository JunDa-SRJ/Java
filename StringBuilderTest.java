package com.itheima03;
/*
   需求：定义一个方法把int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出该结果
   例如：数组为int[] arr = {1，2，3}；执行方法后的输出结果为{1，2，3}

   思路：
      1.定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
      2.定义一个方法，用于把int 数组中的数据按照指定格式拼接成一个字符串返回
      返回值类型String，参数列表 int[] arr
      3.在方法中用 StringBuilder 按照要求进行拼接，并把结果转换成String返回
      4.调用方法，用一个变量接受结果
      5.输出结果
 */

public class StringBuilderTest {
    public static void main(String[] args) {
        //定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};
        //调用方法，用一个变量接受结果

        String s = arrtoString(arr);
        //输出结果
        System.out.println(s);

    }

    //定义一个方法，用于把int 数组中的数据按照指定格式拼接成一个字符串返回, 返回值类型String，参数列表 int[] arr
    public static String arrtoString(int[] arr) {
        //在方法中用 StringBuilder 按照要求进行拼接，并把结果转换成String返回
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");

            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}


