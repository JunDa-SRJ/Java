/*
        算数运算符
*/
public class OperatorDemo {
       public static void main(String[] args){
	   //定义两个变量
	   int a = 6;
	   int b = 4;
	   System.out.println(a+b);
	   System.out.println(a-b);
	   System.out.println(a*b);
	   System.out.println(a/b);
	   System.out.println(a%b);
	   //除法得到的是商，取余得到的是余数
	   //整数想除只能得到整数，要想得到小数，必须有浮点数的参与
       System.out.println(6.0/4); 	   
	   
	   }
}



/*
     赋值运算符
*/
public class OperatorDemo {
        public static void main(String[] args){
		  //把10赋值给int类型的变量i
		  int i = 10;
				System.out.println("i:" + i);
				//+= 把左边和右边的数据做加法操作，结果赋值给左边 
				i += 20;
				//i = i + 20;
				System.out.println("i:" + i);
		//注意:扩展的赋值运算符底层隐含了强制类型转换
		short s = 10;
		//s += 20;
		s = (short)(s + 20);//short在进行运算时自动转换成int类型，所以导致类型不匹配，我们可以强制转换
		System.out.println("s:" + s);
		}


}