import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个10000-99999之间的整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<10000 || num>99999){
			System.out.println("输入有误");
		}

		//个位
		int g = num%10;
		//十位
		int s = (num/10)%10;
		//百位
		int b = (num/100)%10;
		//千位
		int q = (num/1000)%10;
		//万位
		int w = (num/10000)%10;
		

		while(g == w && s == q){
			System.out.println(num+"是回文数");
			return;
		}
		System.out.println(num+"不是回文数");
	}
}
