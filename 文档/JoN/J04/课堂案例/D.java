//输入你的教师等级，判断你的薪水

/*
1-4000
2-5000
3-8000
4-10000



*/
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("输入您的教师等级");
		int  level=in.nextInt();
		//多分支的判断。

//等值判断~区间判断
		switch(level){
			case 1:
				System.out.println("您的底薪是4000");
				break;
			case 2:
				System.out.println("您的底薪是5000");
				break;
			case 3:
				System.out.println("您的底薪是8000");
				break;
			case 4:
				System.out.println("您的底薪是10000");
				break;
			default:
				System.out.println("没有该等级");
		}

		/*
		if(level==1){
			System.out.println("您的底薪是4000");
		}else if(level==2){
			System.out.println("您的底薪是5000");
		}else if(level==3){
			System.out.println("您的底薪是8000");
		}else if(level==4){
			System.out.println("您的底薪是10000");
		}else{
			System.out.println("没有该等级");
		}
		*/
	}
}
