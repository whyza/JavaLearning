/*
循环输入10个数，累加和。平均数
*/
import java.util.Scanner;
class AA 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("请你输入第"+(i+1)+"个数");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("累加和="+sum+"\t平均值:"+sum/arr.length);
	}
}
