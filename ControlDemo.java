/*
   跳转控制语句
  continue:用在循环中，基于条件控制，跳过某次循环内容的执行，继续下一次的执行
  break：用在循环中，基于条件控制，终止循环内容的执行，也就是说结束当前整个循环
*/
public class ControlDemo {
       public static void main(String[] args){
	   for(int i = 1; i <= 5; i++){
	     if(i % 2 == 0){
		 
		   continue;//输出1，3，5
		   //break;//输出1
		 
		 
		 }
	   
	   System.out.println(i);
	  
	   
	   
	   
	   }
	   
	   
	   
	   
	   }


}