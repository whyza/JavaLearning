//1-输入你要出的
//2-电脑随机出一个
//3-判断输赢
import java.util.*;
class JSB 
{
	public static void main(String[] args) 
	{
		//准备工作
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		//开始
		System.out.println("你想出那个？\n0-石头\t1-剪刀\t2-布");
		int user=in.nextInt();
		//提醒用户出了什么
		switch(user){
			case 0:
				System.out.println("你出了【石头】");
			break;
			case 1:
				System.out.println("你出了【剪刀】");
			break;
			case 2:
				System.out.println("你出了【布】");
		}

		int com=r.nextInt(3);
		switch(com){
			case 0:
				System.out.println("电脑出了【石头】");
			break;
			case 1:
				System.out.println("电脑出了【剪刀】");
			break;
			case 2:
				System.out.println("电脑出了【布】");
		}

		int res=user-com;
		if(res==0){
			System.out.println("平局");
		}else if(res==-1 || res==2){
			System.out.println("你赢了");
		}else{
			System.out.println("你输了");
		}






	}
}
/*
\n0-石头\t1-剪刀\t2-布;

Y	C	R	减法
0	0	p	0
0	1	w	-1
0	2	l	-2
1	0	l	1
1	1	p	0
1	2	w	-1
2	0	w	2
2	1	l	1
2	2	p	0



*/
