import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		System.out.println("���Ž���Ƿ�����");
		int count = 1;
		String an = "";
		Scanner sc = new Scanner(System.in);
		an = sc.next();
		while(!"����".equals(an)){
			System.out.println("�����⣬��������");
			an = sc.next();
	}
}
}