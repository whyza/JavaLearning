//输入月份判断有多少天，不考虑闰年
import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入月份");
		int month=in.nextInt();
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"月，有31天");
			break;
			case 2:
				System.out.println(month+"月，有28天");
			break;
			default:
				System.out.println(month+"月，有30天");
		
		}
	}
}
