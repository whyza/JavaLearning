//�����·��ж��ж����죬����������
import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("�����·�");
		int month=in.nextInt();
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"�£���31��");
			break;
			case 2:
				System.out.println(month+"�£���28��");
			break;
			default:
				System.out.println(month+"�£���30��");
		
		}
	}
}
