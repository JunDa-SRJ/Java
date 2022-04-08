package com.itheima03;
/*
      学生类
 */


public class Student {
    //成员变量
    private String name;
    private int age;

   //get/set方法
  /*  public void setName(String n){
         name = n;
    }*/
    public void setName(String name){
        this.name = name;//this修饰的变量用于指代成员变量
    }

    public String getName(){
        return name;
    }
   /* public void setAge(int a){
          age= a;
    }*/
    public void setAge(int age){
        this.age = age;
    }


    public int getAge(){
        return age;
    }
   public void show(){
       System.out.println(name + "," + age);
   }


}
