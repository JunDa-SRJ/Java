/*
    水仙花
	需求：
	   在控制台输出所有的“水仙花数”
*/
public class 水仙花 {
         public static void main(String[] args){
		 //输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
		 for(int i = 100; i <= 999; i++){
		 //在计算之前获取三位数上每个位上的值
		         int a =  i%10;
				 int b = i/10%10;
				 int c = i/10/10%10;
				 //判定条件是将三位数中每个数值取出来，计算立方和后与原始数字比较是否相等
				 if(a*a*a + b*b*b + c*c*c == i){
				 //输出满足的条件下数字就是水仙花数
			         System.out.println(i);	 
				 
				 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }





}	   