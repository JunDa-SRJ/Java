package com.itheima06;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("dajun");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getage());
        t1.teacher();

        Teacher t2 = new Teacher("xiaojun",20);
        System.out.println(t2.getName()+","+t2.getage());
        t2.teacher();


    }
}
