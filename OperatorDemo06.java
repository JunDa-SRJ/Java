/*
 �߼������
*/ 

public class OperatorDemo06 {
   public static void main(String[] args){
    //�������
	int i = 10;
	int j = 20;
	int k = 30;
	//&  ��flase��flase
	System.out.println((i > j) & (i > k));//flase & flase
	System.out.println((i < j) & (i > k));//true & flase
	System.out.println((i > j) & (i < k));//flase & true
	System.out.println((i < j) & (i < k));//true & true
	System.out.println("------");
   //| ��true��true
   System.out.println((i > j) | (i > k));//flase | flase
   System.out.println((i < j) | (i > k));//true | flase
   System.out.println((i > j) | (i < k));//flase | true
   System.out.println((i < j) | (i < k));//true | true
   System.out.println("------");
   //^ ��ͬΪflase����ͬΪtrue
   System.out.println((i > j) ^ (i > k));//flase ^ flase
   System.out.println((i < j) ^ (i > k));//true ^ flase
   System.out.println((i > j) ^ (i < k));//flase ^ true
   System.out.println((i < j) ^ (i < k));//true ^ true
   System.out.println("------");
   //!  ȡ��
   System.out.println((i > j));//flase
   System.out.println(!(i > j));//!flase
   System.out.println(!!(i > j));//!!flase
   System.out.println(!!!(i > j));//!!!flase
   }

}


 /*
 ��·�߼������ 
*/
public class OperatorDemo06 {
   public static void main(String[] args){
   //�������
	int i = 10;
	int j = 20;
	int k = 30;
	//&&  ��flase��flase
	System.out.println((i > j) && (i > k));//flase && flase
	System.out.println((i < j) && (i > k));//true && flase
	System.out.println((i > j) && (i < k));//flase && true
	System.out.println((i < j) && (i < k));//true && true
	System.out.println("------");
   //|| ��true��true
   System.out.println((i > j) || (i > k));//flase || flase
   System.out.println((i < j) || (i > k));//true || flase
   System.out.println((i > j) || (i < k));//flase || true
   System.out.println((i < j) || (i < k));//true || true
   System.out.println("------");
   
   //&&��&
   System.out.println((i++ > 100) & (j++ > 100));//flase & flase
   System.out.println((i++ > 100) && (j++ > 100));//flase && flase  ��·�룬���ж�·Ч�������Ϊflase���ұ߲�ִ��
   System.out.println("i:" + i);
   System.out.println("j:" + j);
   
   }


}