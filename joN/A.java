// <30
//30-40
//40-60
//60-80
//80+

import java.util.*;
class  A
{
	public static void main(String[] args) 
	{
		System.out.println("������ѧԱ����");
		Scanner sc = new Scanner(System.in);
		double marks = sc.nextInt();
		int grades = (int)(marks/10);
		switch(grades){
			case 10:
			case 9:
			case 8:
				System.out.println("A��");
			break;
			case 7:
			case 6:
				System.out.println("B��");
			break;
			case 5:
			case 4:
				System.out.println("C��");
			break;
			case 3:
				System.out.println("D��");
			break;
			case 2:
			case 1:
			case 0:
				System.out.println("E��");
			break;
			default:
				System.out.println("�޵ȼ�,����ķ�����ʽ����ȷ");

		}
	}
}
