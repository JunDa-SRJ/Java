/*
  自增自减运算符
*/
 public class OperatorDemo04{
          public static void main(String[] args){
	//定义变量
       int i = 10;
      System.out.println("i:" + i); 
//单独使用	  
/*		i++;//++i一样，输出的也是11
		System.out.println("i:" + i);
*/		  
		  
//参与操作使用
       // int j = i++;  输出10，++在后面是先把i的值赋值给j，然后再自加
	   int j = ++i;
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		  

}
} 