package com.itheima06;

public class Demo02 {
    public static void main(String[] args) {
        Teacher02 t1 = new Teacher02();
        t1.setName("dajun");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach02();

        Teacher02 t2 = new Teacher02("xiaojun",18);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach02();






    }
}
