import java.util.Scanner;
class  A2
{
	public static void main(String[] args) 
	{
		System.out.println("�������һ������");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.println("������+ - * /");
		String th = sc.next();
		if("+".equals(th)){
			System.out.println("���Ϊ��"+(num1+num2));
		}else if("-".equals(th)){
			System.out.println("���Ϊ��"+(num1-num2));
		}else if("*".equals(th)){
			System.out.println("���Ϊ��"+(num1*num2));
		}else if("/".equals(th)){
			System.out.println("���Ϊ��"+(num1/num2));
		}

	}
}
