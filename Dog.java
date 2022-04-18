package com.itheima06;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name,int age){
        super(name,age);
    }

    public void lookdoor(){
        System.out.println("狗看门");
    }

}
