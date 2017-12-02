import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		System.out.println("彩排结果是否满意");
		int count = 1;
		String an = "";
		Scanner sc = new Scanner(System.in);
		an = sc.next();
		while(!"满意".equals(an)){
			System.out.println("不满意，明天再来");
			an = sc.next();
	}
}
}