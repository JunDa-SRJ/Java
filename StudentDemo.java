package itheima04;

/*
   学生测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.show();

        Student s2 = new Student("dajun");
        s2.show();

     /*  Student s3 = new Student(age:20);
        s3.show();

        Student s4 = new Student(name:"dajun",age:20);
        s4.show();*/
    }
}
