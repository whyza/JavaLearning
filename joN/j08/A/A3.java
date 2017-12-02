import java.util.Scanner;
class  A3
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for(int i=0;i<=arr.length;i++){
			System.out.println("请输入学生"+(i+1)+"成绩");
			double grade = sc.nextDouble();
			sum+=grade;
		}
		System.out.println("平均分为:"+sum/8+"分");
	}
}
