import java.util.Scanner;
class  A1
{
	public static void main(String[] args) 
	{
		System.out.println("����������ǿ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 3){
			System.out.println("����ǿ�����"+num+"����");
		}else if(num >= 3 && num <= 5){
			System.out.println("����ǿ�����"+(num+1)+"����");
		}else if(num > 5){
			System.out.println("����ǿ�����"+(num+2)+"����");
		}
}
}