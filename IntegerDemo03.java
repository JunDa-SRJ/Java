package com.itheima01;
/*
  int和String的相互转换
 */

public class IntegerDemo03 {
    public static void main(String[] args) {
        //int-------String
        int number = 100;
        //方式一
        String s1 = "" + number;
        System.out.println(s1);

        //方式二
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("------------------------" );

       //String------int
        // 方式一
        //String ----Integer ---- int
        String s = "100";
        Integer i  = Integer.valueOf(s);
        //public int intValue ()
        int x = i.intValue();
        System.out.println(x);

        //方式二
        //public static int parseInt(String s)
        int y  = Integer.parseInt(s);
        System.out.println(y);

    }

}
