package com.itheima06;

public class Teacher02 extends Person {
      public Teacher02(){}

      public Teacher02(String name,int age){
//          this.name = name;
//          this.age = age;
        super(name,age);
    }

        public void teach02(){
            System.out.println("用爱成就每一位学员");
        }

}
