import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		int n;
		double num;
		double sum = 0;
		System.out.println("������ѧ������");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	
		if(n<0){
		System.out.println("ѧ����������Ϊ��");
		}
		while(n>0){
			System.out.println("������ѧ��"+n+"����");
			num = sc.nextDouble();
			sum = sum + num;	
			n--;
		}
		System.out.println("�ܷ֣�"+sum);


	}
}
