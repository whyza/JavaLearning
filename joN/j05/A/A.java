import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		double sum = 0;
		while(i<=5){
			System.out.println("请输入学生"+i+"成绩");
			double grade = sc.nextDouble();
			sum = sum + grade;
			i++;
		}
			System.out.println("总分："+sum);
		
		
	}
}
