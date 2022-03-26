/*

      统计
	  需求：
	       统计“水仙花数”一共有多少个，并在控制台输出
*/
public class 水仙花02 {
public static void main(String[] args){
//定义变量count，用于保存“水仙花”的数量，初始值为0
           int count = 0;
		   //输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
    for(int i = 100; i < 1000; i++){
//在计算之前获取三位数中每个位上的值	
	   int a = i%10;
	   int b = i/10%10;
	   int c = i/10/10%10;
	   //在判定水仙花数的过程中，满足条件不再输出，更改为修改count的值，使count+1
	   if(a*a*a + b*b*b + c*c*c == i){
	   
	     count++;
	   
	   
	   }
	}
//打印输出最终结果	
	System.out.println("水仙花数为： " + count + "个");
	
	
	
	
	 
 



}	 
	 
	 
	 
	 
	 } 
  