import java.util.Scanner;
class B3 
{
	public static void main(String[] args) 
	{
		System.out.println("������1 or 2 or 3 or 4");
		System.out.println("1-->ţ�⺺��");
		System.out.println("2-->�¶�������");
		System.out.println("3-->�ϱ��������");
		System.out.println("4-->��У����");
		Scanner sc = new  Scanner(System.in);
		int r = sc.nextInt();
		switch(r){
			case 1:
				System.out.println("ţ�⺺��");
			break;
			case 2:
				System.out.println("�¶�������");
			break;
			case 3:
				System.out.println("�ϱ��������");
			break;
			case 4:
				System.out.println("��У����");
			break;
			default:
				System.out.println("û�и�ѡ��");
			break;
		}
		
	}
}
