/*
      三种循环的区别
*/
public class 三种循环的区别 {
       public static void main(String[] args){
//for,while循环先执行条件判断，再执行循环体，而do....while是先执行循环体再执行条件判断	   
	   //for循环
	   for(int i = 3; i < 3; i++){
	   
	   System.out.println("I LOVE JAVA");
	   
	   
	   }
	   System.out.println("------");
	   //while循环
	   int j = 3;
	   while(j < 3){
	   
	   System.out.println("I LOVE JAVA");
	   j++;
	   }
	   System.out.println("------");
	   //do.....while循环
	   int k = 3;
	   do{
	            System.out.println("I LOVE JAVA");   
	   
                k++;	   
	   }while(k < 3);
	   
	   
	   
	   
	   
	 //  for循环中的i是属于循环结构的，while循环中的j不属于，在循环结束后仍可继续使用
	   //for循环
	   for(int i = 1; i < 3; i++){
	   
	   System.out.println("I LOVE JAVA");
	   
	   
	   }
	   //System.out.println(i);
	   System.out.println("------");
	   //while循环
	   int j = 1;
	   while(j < 3){
	   
	   System.out.println("I LOVE JAVA");
	   j++;
	   }
	   System.out.println(j);
	   System.out.println("------");
	   
	
	
	//死循环
	for(::){
	        System.out.println("for");
	}
	while(true){
	
	System.out.println("while");
	}
	
	do{
             System.out.println("do..while");	
	
	}while(true);
	
	
	
	
	
	
	
	   }






}
 