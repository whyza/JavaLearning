import java.util.Scanner;
class B3 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入1 or 2 or 3 or 4");
		System.out.println("1-->牛肉汉堡");
		System.out.println("2-->奥尔良烤翅");
		System.out.println("3-->老北京鸡肉卷");
		System.out.println("4-->上校鸡块");
		Scanner sc = new  Scanner(System.in);
		int r = sc.nextInt();
		switch(r){
			case 1:
				System.out.println("牛肉汉堡");
			break;
			case 2:
				System.out.println("奥尔良烤翅");
			break;
			case 3:
				System.out.println("老北京鸡肉卷");
			break;
			case 4:
				System.out.println("上校鸡块");
			break;
			default:
				System.out.println("没有该选项");
			break;
		}
		
	}
}
