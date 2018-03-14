//6.输入一批数字，求这一批数字的最大值，
//最小值，输入0截止
import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入一个数");
		int num=in.nextInt();
		int max=num,min=num;
		while(true){
			
			System.out.println("输入一个数");
			num=in.nextInt();
			if(num==0)
				break;
			if(num>max)
				max=num;
			if(num<min)
				min=num;
		}
		System.out.println("max="+max+"\tmin="+min);
		
	}
}
