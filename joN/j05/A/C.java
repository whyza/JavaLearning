import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		int n;
		double num;
		double sum = 0;
		System.out.println("请输入学生数量");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	
		if(n<0){
		System.out.println("学生人数不能为负");
		}
		while(n>0){
			System.out.println("请输入学生"+n+"分数");
			num = sc.nextDouble();
			sum = sum + num;	
			n--;
		}
		System.out.println("总分："+sum);


	}
}
