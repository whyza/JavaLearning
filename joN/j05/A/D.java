import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("������һ��10000-99999֮�������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<10000 || num>99999){
			System.out.println("��������");
		}

		//��λ
		int g = num%10;
		//ʮλ
		int s = (num/10)%10;
		//��λ
		int b = (num/100)%10;
		//ǧλ
		int q = (num/1000)%10;
		//��λ
		int w = (num/10000)%10;
		

		while(g == w && s == q){
			System.out.println(num+"�ǻ�����");
			return;
		}
		System.out.println(num+"���ǻ�����");
	}
}
