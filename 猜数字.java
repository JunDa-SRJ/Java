/* 
   ������
   
   ����
          �����Զ�����һ��1-100֮������֣�ʹ�ó���ʵ�ֲ³���������Ƕ��٣�
		  ���´��ʱ����ݲ�ͬ���������Ӧ����ʾ
		  
		  ����µ����ֱ��������ִ���ʾ��µ����ݴ���
		  ����µ����ֱ���ʵ����С����ʾ��µ�����С��
		  �����µ����ֺ���ʵ��������ȣ���ʾ�������
*/
import java.util.Scanner;
import java.util.Random;
public class ������ {
     public static void main(String[] args){
	 //Ҫ����ɲ����ֵ���Ϸ������Ҫ��һ��Ҫ�µ����֣�ʹ��������������֣���Χ1-100֮������֣�ʹ�ó���ʵ�ֲ³���������Ƕ��٣�
	 Random r = new Random();
	 int number = r.nextInt(100) + 1;
	while(true){ 
	 //ʹ�ó���ʵ�ֲ����֣�ÿ�ξ�Ҫ����µ����֣���Ҫʹ�ü���¼��ʵ��
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("��������Ҫ�µ����֣� ");
	 int guessnumber = sc.nextInt();
	 
	 //�Ƚ���������ֺ�ϵͳ���������ݣ���Ҫʹ�÷�֧��䡣����ʹ��if...else..if..��ʽ�����ݲ�ͬ��������в²�����ʾ
	 if(guessnumber == number ){
	     System.out.println("�������");
		 break;
	 }else if(guessnumber < number){
	    System.out.println("��µ�����С��"); 
	 }else{
	    System.out.println("��µ����ݴ���"); 
	 }
	 }
	 }
}