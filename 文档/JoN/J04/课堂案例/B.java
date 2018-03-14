//要求用户输入自己的性别，如果性别是男，就说奖励刘冠婷，如果是女，奖励王先杰
import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入你的性别：");
		String sex=in.next();
		if(sex.equals("男")){//"男".equals(sex)
			System.out.println("奖励刘冠婷");
		}else{
			System.out.println("奖励王先杰");
		}
	}
}
