import java.util.Scanner;
class  A6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int count = 1;
		while(i<=5){
			System.out.println("������ѧ��"+count+"����");
			String name = sc.next();
			System.out.println("��"+count+"��ѧ����������"+name);
			count++;
			i++;
		}
	}
}
