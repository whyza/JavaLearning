import java.util.Scanner;
class A4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String an = "";
		for(int i=1;i<=3;i++){
			System.out.println("第"+i+"题");
			for(int j=1;j<=3;j++){
				System.out.print("\t做题。。。\n\t对了吗？\n\t");
				an = sc.next();
			}
		}
	}
}
