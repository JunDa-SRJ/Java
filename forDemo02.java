/*
   求和
   
   需求：
          求1-5之间的数据和，并把求和结果在控制台输出
*/

public class forDemo02 {
            public static void main(String[] args){
			//求和最终结果必须保存起来，需要一个定义，用于保存求和的结果，初始值为0
			int sum = 0;
			//从1开始到5结束的数据，使用循环结构完成
			
			for(int i = 1;i <= 5;i++){
			//将反复进行的事情写入循环结构内部，此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
			sum += i;
			/*sum += i; sum = sum + i;
			  第一次: sum = sum + i = 0 + 1 = 1;
			  第二次: sum = sum + i = 1 + 2 = 3;
			  第三次: sum = sum + i = 3 + 3 = 6;
			  第四次: sum = sum + i = 6 + 4 = 10;
 			  第五次: sum = sum + i = 10 + 5 = 15;
			*/
			}
			//当循环结束时，将最终的数据打印出来
			System.out.println("1-5之间的数据和: " + sum);
			
			
			
			}



}




/*  

    求偶数和
   需求：
          求1-100之间的偶数和，并把求和的结果在控制台输出
*/
public class forDemo02{
        public static void main(String[] args){
		//求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
		int sum = 0;
		
		//对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不一样
		for(int i = 1; i <= 100;i++){
		//对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
		if(i % 2 == 0){
	          sum += i;	
		
		}
		
		
		}
		
		
		
		
		//执行完毕，将最终数据打印出来
		
		System.out.println("1-100之间的偶数和： "+ sum);
		
		
		
		}




}		  
     