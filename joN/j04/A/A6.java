import java.util.Scanner;
import java.util.Random;
class A6 
{
	public static void main(String[] args) 
	{
		System.out.println("���մ���?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Random	r = new Random();
		int w = r.nextInt(5);
		switch(w){
			case 0:
			System.out.println(name+"ԭ���±�����һ��ΰ���������");
			break;
			case 1:
			System.out.println(name+"ԭ���±�����һͷ�ó���������");
			break;
			case 2:
			System.out.println(name+"ԭ���±�����һ���ϱϵĺ�ѧ��");
			break;
			case 3:
			System.out.println(name+"ԭ���±�����һ���ò����ʯͷ");
			break;
			case 4:
			System.out.println(name+"ԭ���±�����һ�ų����ߵ�����");
			break;
		}
			
	}
}
