import java.util.Scanner;
class  A1
{
	public static void main(String[] args) 
	{
		System.out.println("请输入王宝强的买桃数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 3){
			System.out.println("王宝强最后有"+num+"个桃");
		}else if(num >= 3 && num <= 5){
			System.out.println("王宝强最后有"+(num+1)+"个桃");
		}else if(num > 5){
			System.out.println("王宝强最后有"+(num+2)+"个桃");
		}
}
}