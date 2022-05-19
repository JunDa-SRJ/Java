package com.itheima02;
/*
     构造方法：
           public SimpleDateFormat():构造一个SimpleDateFormat，使用默认模式和日期格式
           public SimpleDateFormat（String pattern）：构造一个SimpleDateFormat使用给定的模式和默认日期

    格式化： 从Date 到String
           public final String format(Date date):将日期格式化成日期/时间字符串

    解析：  从String 到 Date
          public Date parse(String source):从给定字符串的开始解析文本以生成日期


 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化：从Date到String
        Date d = new Date();
       // SimpleDateFormat std = new SimpleDateFormat();
        SimpleDateFormat std = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = std.format(d);
        System.out.println(s);
        System.out.println("----------------");

   //解析：  从String 到 Date
        String ss = "2024-10-20 11:10:25";
        SimpleDateFormat std2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = std2.parse(ss);
        System.out.println(dd);
    }
}
