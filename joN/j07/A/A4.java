import java.util.Scanner;
class A4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String an = "";
		for(int i=1;i<=3;i++){
			System.out.println("��"+i+"��");
			for(int j=1;j<=3;j++){
				System.out.print("\t���⡣����\n\t������\n\t");
				an = sc.next();
			}
		}
	}
}
