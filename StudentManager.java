package com.itheima04;
/*
   学生管理系统
 */


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
/*
        1.用输出语句完成主界面的编写
        2.用Scanner实现键盘录入数据
        3.用Switch语句完成操作的选择
        4.用循环完成再次回到主界面
 */

    public static void main(String[] args) {
        //创建集合对象，用于存储学生对象
        ArrayList<Student> array = new ArrayList<>();
        //用输出语句完成主界面的编写
        while (true) {
            System.out.println("--------欢迎来到学生管理系统-----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择： ");
            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            //用Switch语句完成操作的选择
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    //System.out.println("删除学生");
                    break;
                case "3":
                    updateStudent(array);
                    // System.out.println("修改学生");
                    break;
                case "4":
                    // System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);
            }
        }
    }


    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true) {
            System.out.println("请输入学生的学号： ");
             sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生的姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄： ");
        String age = sc.nextLine();
        System.out.println("请输入学生的居住地： ");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);
        s.setSid(sid);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }
    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array,String sid){
         boolean flag = false;
         for(int i = 0;i< array.size();i++){
             Student s =new Student();
             if(s.getsid().equals(sid)){
                 flag = true;
                 break;
             }
         }
         return flag;
    }





    //定义一个方法用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息");
            //为了让程序不再往下执行，给出return；
            return;
        }


        //显示表头
        //\t相当于tab键位置
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");


        //遍历信息
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getsid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());

        }
    }

   //定义一个方法用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        //用键盘录入要删除学生的信息
      /*  Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(s.getsid().equals(sid)){
                array.remove(sid);
            }
        }
        System.out.println("删除成功");*/
        //键盘录入要修改学生学号，显示提示信息
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入你要删除学生的学号： ");
        String sid = sc.nextLine();
         int index = -1;
        //在删除或者修改学生的操作前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除或者修改操作
        for(int i = 0;i< array.size();i++){
            Student s = array.get(i);
            if(s.getsid().equals(sid)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该信息不存在，请重新输入");
        }
        else{
            array.remove(index);
            //给出删除成功的提示
            System.out.println("删除学生成功");
        }
    }


   //定义一个方法用于修改学生信息
    public static  void updateStudent(ArrayList<Student> array){
       /* Scanner sc =new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号： ");
        String sid = sc.nextLine();


        System.out.println("请输入学生的新姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入学生的新年龄： ");
        String age = sc.nextLine();
        System.out.println("请输入学生的新地址： ");
        String address = sc.nextLine();


        //创建学生对象
        Student s =new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);





        for(int i = 0;i< array.size();i++){
            Student student =array.get(i);
            if(student.getsid().equals(sid)){
                array.set(i,s);
            }
        }
        System.out.println("修改成功");

        */

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改学生的学号： ");
        String sid = sc.nextLine();

        System.out.println("请输入学生的新姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄： ");
        String age =  sc.nextLine();
        System.out.println("请输入学生的新地址： ");
        String address = sc.nextLine();


        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        int index = -1;
        for(int i = 0;i< array.size();i++){
            Student student = array.get(i);
            if(s.getsid().equals(sid)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else{
            array.set(index,s);
            System.out.println("修改成功");
        }






    }



}