/*
   if����ʽ1
   
   ��ʽ��
   if(��ϵ���ʽ){
              ����壻
   }
   ִ�����̣�
   1.���ȼ����ϵ���ʽ��ֵ
   2.�����ϵ���ʽ��ֵΪtrue��ִ�������
   3.�����ϵ���ʽ��ֵΪfalse�Ͳ�ִ�������
   4.����ִ�к�����������
  */ 
  
  public class ifDemo {
     public static void main(String[] args){
	 System.out.println("��ʼ");
	 //������������
	 int a = 10;
	 int b = 20;
	 //�����ж�a��b��ֵ�Ƿ���ȣ������ȣ����ڿ���̨����� a����b
	 if(a == b){
	           System.out.println("a����b");
	 }
	 //�����ж�a��c��ֵ�Ƿ���ȣ������ȣ����ڿ���̨�����a����c
	 int c = 10;
	 if(a == c){
	     System.out.println("a����c");
	 
	 }
	 
	 System.out.println("����");
	 
	 } 
  
  }
  
  /*  
    if����ʽ2
	��ʽ��
	if(��ϵ���ʽ){
	     �����1��
		}else
		{
		  �����2��
		}
	ִ�����̣�
   1.���ȼ����ϵ���ʽ��ֵ
   2.�����ϵ���ʽ��ֵΪtrue��ִ�������1
   3.�����ϵ���ʽ��ֵΪfalse��ִ�������2
   4.����ִ�к�����������
   */
public class ifDemo {
   public static void main(String[] args){
      //������������
	  int a = 10;
	  int b = 20;
	  //�����ж�a�Ƿ����b������ǣ��ڿ���̨�����a��ֵ����b���������a��ֵ������b
	  if(a > b){
	      System.out.println("a��ֵ����b");
	  }else{
	  
	  System.out.println("a��ֵ������b");
	  
	  }
	  
	  
	  
	   System.out.println("����");
   
   
   }


}

/* 
    if����ʽ3
	��ʽ��
	if����ϵ���ʽ��{
	   �����1��
	}else{
	   �����2��
	}
   .......
   else{
      �����n+1��
   }
	
	ִ�����̣�
	1.���ȼ����ϵ���ʽ1��ֵ
	2.���ֵΪtrue��ִ�������1�����ֵΪfalse�ͼ����ϵ���ʽ2��ֵ
	3.���ֵΪtrue��ִ�������2�����ֵΪfalse�ͼ����ϵ���ʽ3��ֵ
	4��........
	5.���û���κι�ϵ���ʽΪtrue����ִ�������n+1��
*/

import java.util.Scanner;
public class ifDemo {

       public static void main(String[] args){
	   System.out.println("��ʼ");
	   
	   //���󣺴Ӽ���¼��һ����������1��2��3.......7���������Ӧ������һ�����ڶ�......������
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("������һ��������(1-7): ");
	   
	   int week = sc.nextInt();
	   if(week < 1 || week > 7){
	     System.out.println("���������������");
	   }else if(week == 1){
	     System.out.println("����һ");
	   }else if(week == 2){
	     System.out.println("���ڶ�");
	   }else if(week == 3){
	     System.out.println("������");
	   }else if(week == 4){
	     System.out.println("������");
	   }else if(week == 5){
	     System.out.println("������");
	   }else if(week == 6){
	     System.out.println("������");
	   }else{
	   System.out.println("������");
	   }
	   System.out.println("����");
	 	   
	   }

}
	