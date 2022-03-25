/*
   if语句格式1
   
   格式：
   if(关系表达式){
              语句体；
   }
   执行流程：
   1.首先计算关系表达式的值
   2.如果关系表达式的值为true就执行语句体
   3.如果关系表达式的值为false就不执行语句体
   4.继续执行后面的语句内容
  */ 
  
  public class ifDemo {
     public static void main(String[] args){
	 System.out.println("开始");
	 //定义两个变量
	 int a = 10;
	 int b = 20;
	 //需求：判断a和b的值是否相等，如果相等，就在控制台输出： a等于b
	 if(a == b){
	           System.out.println("a等于b");
	 }
	 //需求：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
	 int c = 10;
	 if(a == c){
	     System.out.println("a等于c");
	 
	 }
	 
	 System.out.println("结束");
	 
	 } 
  
  }
  
  /*  
    if语句格式2
	格式：
	if(关系表达式){
	     语句体1；
		}else
		{
		  语句体2；
		}
	执行流程：
   1.首先计算关系表达式的值
   2.如果关系表达式的值为true就执行语句体1
   3.如果关系表达式的值为false就执行语句体2
   4.继续执行后面的语句内容
   */
public class ifDemo {
   public static void main(String[] args){
      //定义两个变量
	  int a = 10;
	  int b = 20;
	  //需求：判断a是否大于b，如果是，在控制台输出：a的值大于b；否则，输出a的值不大于b
	  if(a > b){
	      System.out.println("a的值大于b");
	  }else{
	  
	  System.out.println("a的值不大于b");
	  
	  }
	  
	  
	  
	   System.out.println("结束");
   
   
   }


}

/* 
    if语句格式3
	格式：
	if（关系表达式）{
	   语句体1；
	}else{
	   语句体2；
	}
   .......
   else{
      语句体n+1；
   }
	
	执行流程：
	1.首先计算关系表达式1的值
	2.如果值为true就执行语句体1；如果值为false就计算关系表达式2的值
	3.如果值为true就执行语句体2；如果值为false就计算关系表达式3的值
	4：........
	5.如果没有任何关系表达式为true，就执行语句体n+1。
*/

import java.util.Scanner;
public class ifDemo {

       public static void main(String[] args){
	   System.out.println("开始");
	   
	   //需求：从键盘录入一个星期数（1，2，3.......7），输出对应的星期一，星期二......星期日
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("请输入一个星期数(1-7): ");
	   
	   int week = sc.nextInt();
	   if(week < 1 || week > 7){
	     System.out.println("你输入的数字有误");
	   }else if(week == 1){
	     System.out.println("星期一");
	   }else if(week == 2){
	     System.out.println("星期二");
	   }else if(week == 3){
	     System.out.println("星期三");
	   }else if(week == 4){
	     System.out.println("星期四");
	   }else if(week == 5){
	     System.out.println("星期五");
	   }else if(week == 6){
	     System.out.println("星期六");
	   }else{
	   System.out.println("星期日");
	   }
	   System.out.println("结束");
	 	   
	   }

}
	