/*
   do....while���
   ������ʽ��
        do{
		     ѭ������䣻
		}while�������ж���䣩��
	������ʽ��
          ��ʼ����䣺
        do{
		    ѭ������䣻
			����������䣻
		}while�������ж���䣩��
	ִ�����̣�
            1.ִ�г�ʼ�����
            2.ִ��ѭ�������
            3.ִ�������������
            4.ִ�������ж���䣬��������true����false
                    �����false��ѭ������
                    �����true������ִ��
            5.�ص�2����
*/

public class dowhileDemo{
  public static void main(String[] args){
       //�����ڿ���̨�����Ρ�HelloWorld��
	   //forѭ��ʵ��
	  for(int i = 1; i <= 5; i++){
           	  
	    System.out.println("HelloWorld"); 
	  
	  }
	   System.out.println("---------");

	   //whileѭ��ʵ��
	   int j = 1;
	   while(j <= 5){
	  
	  System.out.println("HelloWorld"); 
	   j++;
	   }
	   System.out.println("--------");
	   //do...whileѭ��ʵ��
        int k = 1;
       do {
	   
	   System.out.println("HelloWorld");
	   k++;
	   
	   }while(k <= 5);
  
      System.out.println("--------");
  }



}			