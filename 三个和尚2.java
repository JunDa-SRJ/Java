/* 
    ��������
	����:
	   һ��������ס���������У����ǵ���߱��뾭�������ó������ó���ʵ�ֻ�ȡ���������е�������
*/
import java.util.Scanner;
public class ��������2 {
          public static void main(String[] args){
		  //���δ֪�����ü���¼��ʵ�֡����ȵ�����Ȼ�󴴽�����
		  Scanner sc = new Scanner(System.in);
  		  //����¼��������߷ֱ�ֵ����������
		  System.out.println("�������һ�����е���ߣ� ");
		  int height1 = sc.nextInt();
		  System.out.println("������ڶ������е���ߣ� ");
          int height2 = sc.nextInt();
		  System.out.println("��������������е���ߣ� ");
          int height3 = sc.nextInt();		  
		  //����Ԫ�������ȡǰ�������еĽϸ����ֵ��������ʱ��߱�����������
		  int tempheight = height1 > height2 ? height1 : height2;
		  //����Ԫ�������ȡ��ʱ��ߺ͵�����������߽ϸ�ֵ�����������߱�������
		  int MaxHeight = tempheight > height3 ? tempheight : height3;
		  //������
		  //System.out.println("MaxHeight:" + MaxHeight);
		  System.out.println("�����������������ߵ���: " + MaxHeight + "cm");
		  }

}	   