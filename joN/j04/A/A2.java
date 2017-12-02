import java.util.Scanner;
class  A2
{
	public static void main(String[] args) 
	{
		System.out.println("请输入第一个整数");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int num2 = sc.nextInt();
		System.out.println("请输入+ - * /");
		String th = sc.next();
		if("+".equals(th)){
			System.out.println("结果为："+(num1+num2));
		}else if("-".equals(th)){
			System.out.println("结果为："+(num1-num2));
		}else if("*".equals(th)){
			System.out.println("结果为："+(num1*num2));
		}else if("/".equals(th)){
			System.out.println("结果为："+(num1/num2));
		}

	}
}
