import java.util.Scanner;
class  A6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int count = 1;
		while(i<=5){
			System.out.println("请输入学生"+count+"姓名");
			String name = sc.next();
			System.out.println("第"+count+"个学生的姓名是"+name);
			count++;
			i++;
		}
	}
}
