/*
        ���������
*/
public class OperatorDemo {
       public static void main(String[] args){
	   //������������
	   int a = 6;
	   int b = 4;
	   System.out.println(a+b);
	   System.out.println(a-b);
	   System.out.println(a*b);
	   System.out.println(a/b);
	   System.out.println(a%b);
	   //�����õ������̣�ȡ��õ���������
	   //�������ֻ�ܵõ�������Ҫ��õ�С���������и������Ĳ���
       System.out.println(6.0/4); 	   
	   
	   }
}



/*
     ��ֵ�����
*/
public class OperatorDemo {
        public static void main(String[] args){
		  //��10��ֵ��int���͵ı���i
		  int i = 10;
				System.out.println("i:" + i);
				//+= ����ߺ��ұߵ��������ӷ������������ֵ����� 
				i += 20;
				//i = i + 20;
				System.out.println("i:" + i);
		//ע��:��չ�ĸ�ֵ������ײ�������ǿ������ת��
		short s = 10;
		//s += 20;
		s = (short)(s + 20);//short�ڽ�������ʱ�Զ�ת����int���ͣ����Ե������Ͳ�ƥ�䣬���ǿ���ǿ��ת��
		System.out.println("s:" + s);
		}


}