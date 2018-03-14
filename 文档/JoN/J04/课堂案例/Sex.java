//输入大名，判断你未来的小孩是男还是女 0-女  1-男   2-人妖
import java.util.Scanner;
import java.util.Random;
class Sex 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("大侠请留下姓名：");
		String name=in.next();
//r.nextInt();//整数范围内的随机数
		int sex=r.nextInt(3);
		switch(sex){
			case 0:
				System.out.println(name+"未来的小孩是【女孩儿】");
			break;
			case 1:
				System.out.println(name+"未来的小孩是【男孩儿】");
			break;
			default:
				System.out.println(name+"未来的小孩是【人妖】");
			

		}


	}
}
