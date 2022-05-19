package com.itheima01;
/*
   装箱：把基本的数据类型转换为对应的包装类类型
   拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo04 {
    public static void main(String[] args) {
        //装箱：把基本的数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        Integer ii = 100;//自动装箱  Integer.valueOf(200);

        // 拆箱：把包装类类型转换为对应的基本数据类型
        // ii += 200;
       //自动拆箱 ii = ii.intValue() + 200;
        ii += 200;
        System.out.println(ii);

        Integer iii = null;
        if(iii != null){
            iii += 300;
        }
    }
}
