import java.util.Scanner;
import java.util.Random;
class A7 
{
	public static void main(String[] args) 
	{
		//1---100
		Scanner sc = new Scanner(System.in);	
		int r = (int)(Math.random()*100+1);
		int uNum ;
		System.out.println("猜拳游戏开始");
		System.out.println("==========================");
		System.out.println("电脑生成了一个随机数1--100");
		while(true){
			System.out.println("请输入---");
			uNum = sc.nextInt();
			if(uNum == r){
			System.out.println("猜对了");
			break;
			}
			if(uNum > r){
			System.out.println("大了");
			continue;
			}else if(uNum < r){
			System.out.println("小了");
			continue;
			}
		}
			
	}
}
