import java.util.Scanner;
class A6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr  = new int[5];
		double sum=0;
		System.out.println("ѧ��1\tѧ��2\tѧ��3\tѧ��4\tѧ��5");
		for(int i=0;i<arr.length;i++){
			int num = sc.nextInt();
			System.out.print("\t");
			sum+=num;
		}
		System.out.println("ƽ������:"+sum/5.0);
	}
}
