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
		System.out.println("请输入学员分数");
		Scanner sc = new Scanner(System.in);
		double marks = sc.nextInt();
		int grades = (int)(marks/10);
		switch(grades){
			case 10:
			case 9:
			case 8:
				System.out.println("A级");
			break;
			case 7:
			case 6:
				System.out.println("B级");
			break;
			case 5:
			case 4:
				System.out.println("C级");
			break;
			case 3:
				System.out.println("D级");
			break;
			case 2:
			case 1:
			case 0:
				System.out.println("E级");
			break;
			default:
				System.out.println("无等级,输入的分数格式不正确");

		}
	}
}
