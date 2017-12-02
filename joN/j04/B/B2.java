import java.util.Scanner;
class B2 
{
	public static void main(String[] args) 
	{

		System.out.println("请输入年份");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
		System.out.println(year+"年是润年");
		}else{
		System.out.println(year+"年是平年");
		}
	}
}
