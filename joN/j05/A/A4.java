import java.util.Scanner;
class  A4
{
	public static void main(String[] args) 
	{
		String  an = "";
		System.out.println("我喜欢你,你喜欢我吗？");
		Scanner sc = new Scanner(System.in);
		an = sc.next();
		while(!"喜欢".equals(an)){
			System.out.println("你喜欢我吗？");
			an = sc.next();
		}
		System.out.println("在一起");
	}
}
