import java.util.Scanner;
class A6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr  = new int[5];
		double sum=0;
		System.out.println("学生1\t学生2\t学生3\t学生4\t学生5");
		for(int i=0;i<arr.length;i++){
			int num = sc.nextInt();
			System.out.print("\t");
			sum+=num;
		}
		System.out.println("平均分是:"+sum/5.0);
	}
}
