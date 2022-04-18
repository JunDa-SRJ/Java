package com.itheima06;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("huahua");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catMouse();

        Dog d1 = new Dog();
        d1.setName("dahuang");
        d1.setAge(5);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookdoor();

        Cat c2 = new Cat("niuniu",20);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catMouse();
    }

}
