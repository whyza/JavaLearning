import java.util.Scanner;
import java.util.Random;
class A6 
{
	public static void main(String[] args) 
	{
		System.out.println("尊姓大名?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Random	r = new Random();
		int w = r.nextInt(5);
		switch(w){
			case 0:
			System.out.println(name+"原来下辈子是一个伟大的赛亚人");
			break;
			case 1:
			System.out.println(name+"原来下辈子是一头好吃懒做的猪");
			break;
			case 2:
			System.out.println(name+"原来下辈子是一个老毕的好学生");
			break;
			case 3:
			System.out.println(name+"原来下辈子是一颗敲不碎的石头");
			break;
			case 4:
			System.out.println(name+"原来下辈子是一颗长不高的松树");
			break;
		}
			
	}
}
