/*
ѭ������10�������ۼӺ͡�ƽ����
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
			System.out.println("���������"+(i+1)+"����");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		System.out.println("�ۼӺ�="+sum+"\tƽ��ֵ:"+sum/arr.length);
	}
}
