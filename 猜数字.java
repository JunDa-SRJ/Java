/* 
   猜数字
   
   需求：
          程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
		  当猜错的时候根据不同情况给出相应的提示
		  
		  如果猜的数字比真是数字大，提示你猜的数据大了
		  如果猜的数字比真实数字小，提示你猜的数据小了
		  如果你猜的数字和真实的数字相等，提示你猜中了
*/
import java.util.Scanner;
import java.util.Random;
public class 猜数字 {
     public static void main(String[] args){
	 //要先完成猜数字的游戏，首先要有一个要猜的数字，使用随机数生成数字，范围1-100之间的数字，使用程序实现猜出这个数字是多少？
	 Random r = new Random();
	 int number = r.nextInt(100) + 1;
	while(true){ 
	 //使用程序实现猜数字，每次均要输入猜的数字，需要使用键盘录入实现
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("请输入你要猜的数字： ");
	 int guessnumber = sc.nextInt();
	 
	 //比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if...else..if..格式，根据不同的情况进行猜测结果显示
	 if(guessnumber == number ){
	     System.out.println("你猜中了");
		 break;
	 }else if(guessnumber < number){
	    System.out.println("你猜的数据小了"); 
	 }else{
	    System.out.println("你猜的数据大了"); 
	 }
	 }
	 }
}