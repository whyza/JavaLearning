/*
���ͽ�׷������
*/
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String an="";
		System.out.println("��������ϲ�����ͽ���");
		an=in.next();//1
		while(!"ϲ��".equals(an)){//2
			System.out.println("��������ϲ�����ͽ���");//3
			an=in.next();//4
		}
		System.out.println("��һ��");
	}
}
