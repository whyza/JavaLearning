import java.util.Scanner;

class A 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String an="";
		do{
			System.out.println("��������ϲ�����ͽ���");
			an=in.next();
		}while(!an.equals("ϲ��"));

		System.out.println("��һ��");
	}
}
