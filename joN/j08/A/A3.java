import java.util.Scanner;
class  A3
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i=0;i<=arr.length;i++){
			System.out.println("������ѧ��"+(i+1)+"�ɼ�");
			double grade = sc.nextDouble();
			sum+=grade;
		}
		System.out.println("ƽ����Ϊ:"+sum/8+"��");
	}
}
