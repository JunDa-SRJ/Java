/*
 逻辑运算符
*/ 

public class OperatorDemo06 {
   public static void main(String[] args){
    //定义变量
	int i = 10;
	int j = 20;
	int k = 30;
	//&  有flase则flase
	System.out.println((i > j) & (i > k));//flase & flase
	System.out.println((i < j) & (i > k));//true & flase
	System.out.println((i > j) & (i < k));//flase & true
	System.out.println((i < j) & (i < k));//true & true
	System.out.println("------");
   //| 有true则true
   System.out.println((i > j) | (i > k));//flase | flase
   System.out.println((i < j) | (i > k));//true | flase
   System.out.println((i > j) | (i < k));//flase | true
   System.out.println((i < j) | (i < k));//true | true
   System.out.println("------");
   //^ 相同为flase，不同为true
   System.out.println((i > j) ^ (i > k));//flase ^ flase
   System.out.println((i < j) ^ (i > k));//true ^ flase
   System.out.println((i > j) ^ (i < k));//flase ^ true
   System.out.println((i < j) ^ (i < k));//true ^ true
   System.out.println("------");
   //!  取反
   System.out.println((i > j));//flase
   System.out.println(!(i > j));//!flase
   System.out.println(!!(i > j));//!!flase
   System.out.println(!!!(i > j));//!!!flase
   }

}


 /*
 短路逻辑运算符 
*/
public class OperatorDemo06 {
   public static void main(String[] args){
   //定义变量
	int i = 10;
	int j = 20;
	int k = 30;
	//&&  有flase则flase
	System.out.println((i > j) && (i > k));//flase && flase
	System.out.println((i < j) && (i > k));//true && flase
	System.out.println((i > j) && (i < k));//flase && true
	System.out.println((i < j) && (i < k));//true && true
	System.out.println("------");
   //|| 有true则true
   System.out.println((i > j) || (i > k));//flase || flase
   System.out.println((i < j) || (i > k));//true || flase
   System.out.println((i > j) || (i < k));//flase || true
   System.out.println((i < j) || (i < k));//true || true
   System.out.println("------");
   
   //&&和&
   System.out.println((i++ > 100) & (j++ > 100));//flase & flase
   System.out.println((i++ > 100) && (j++ > 100));//flase && flase  短路与，具有短路效果，左边为flase则右边不执行
   System.out.println("i:" + i);
   System.out.println("j:" + j);
   
   }


}