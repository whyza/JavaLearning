//6.����һ�����֣�����һ�����ֵ����ֵ��
//��Сֵ������0��ֹ
import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("����һ����");
		int num=in.nextInt();
		int max=num,min=num;
		while(true){
			
			System.out.println("����һ����");
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
