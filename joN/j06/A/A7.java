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
		System.out.println("��ȭ��Ϸ��ʼ");
		System.out.println("==========================");
		System.out.println("����������һ�������1--100");
		while(true){
			System.out.println("������---");
			uNum = sc.nextInt();
			if(uNum == r){
			System.out.println("�¶���");
			break;
			}
			if(uNum > r){
			System.out.println("����");
			continue;
			}else if(uNum < r){
			System.out.println("С��");
			continue;
			}
		}
			
	}
}
