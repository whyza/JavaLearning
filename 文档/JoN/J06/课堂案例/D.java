/*
ÍõÏÍ½Ü×·Áõ¹ÚæÃ
*/
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String an="";
		System.out.println("Áõ¹ÚæÃÄãÏ²»¶ÍõÏÍ½ÜÂğ£¿");
		an=in.next();//1
		while(!"Ï²»¶".equals(an)){//2
			System.out.println("Áõ¹ÚæÃÄãÏ²»¶ÍõÏÍ½ÜÂğ£¿");//3
			an=in.next();//4
		}
		System.out.println("ÔÚÒ»Æğ");
	}
}
