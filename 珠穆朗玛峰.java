/* 
   珠穆朗玛峰
   
   需求：
       世界最高山峰是珠穆朗玛峰（8844.43米=8844430毫米），假如我有一张足够大的纸，它的厚度为0.1毫米。
	   请问，折叠多少次，可以折成珠穆朗玛峰的高度？
*/
public class 珠穆朗玛峰 {
    public static void main(String[] args){
	int count = 0;
	double paper = 0.1;
	int height = 8844430;
	while(paper < 8844430){
	  paper *= 2;
	  
	  count++;
	
	}
	
	System.out.println("折叠的次数为： " + count + "次");
	
	} 


}	   