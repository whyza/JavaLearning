import java.util.Scanner;
class  A4
{
	public static void main(String[] args) 
	{
		String  an = "";
		System.out.println("��ϲ����,��ϲ������");
		Scanner sc = new Scanner(System.in);
		an = sc.next();
		while(!"ϲ��".equals(an)){
			System.out.println("��ϲ������");
			an = sc.next();
		}
		System.out.println("��һ��");
	}
}
