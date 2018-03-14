/*
7.首先由电脑随机产生一个1到100
(可以自己设置)的一个随机数，
然后让玩家来猜，
如果猜大了，电脑就提示“大了”，
如果猜小了，电脑就提示“小了”，
如果猜对了，电脑就提示“对了”
则程序结束，否则继续猜。

*/
import java.util.*;
class AA 
{
	public static void main(String[] args) 
	{
		//1-产生随机数
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		

		/*
		int res=r.nextInt(100)+1;

		//2-循环输入做比较
		while(true){
			System.out.println("你猜：");
			int input=in.nextInt();
			if(input>res){
				System.out.println("你猜大了");
				continue;
			}
			if(input<res){
				System.out.println("你猜小了");
				continue;
			}
			if(input==res){	//3-猜对停止循环
				System.out.println("你猜对了，下次请老毕吃饭……");
				break;
			}

		
		
		}


8.使用while查询银行会员操作系统：
“欢迎使用银行操作系统，
输入1,存入多少钱,输入2,
取出多少钱,输入0.
退出时才能算出还剩下多少钱;

*/
/*
	int sum=0;
	while(1==1){
		System.out.println("欢迎使用银行操作系统，1-存取\t2-取钱\t0-退出");
		int cmd=in.nextInt();
		if(cmd==1){
			System.out.println("兄弟你存多少");
			int cq=in.nextInt();
			sum+=cq;
			System.out.println("本次存入"+cq+"块钱，你的余额是"+sum+"块钱");
		}else if(cmd==2){
			System.out.println("兄弟你取多少");
			int qq=in.nextInt();
			sum-=qq;
			System.out.println("本次取出"+qq+"块钱，你的余额是"+sum+"块钱");
		}else if(cmd==0){
			System.out.println("你的余额是"+sum+"块钱");
			break;
		}else{
			System.out.println("输入错误");
		}
			 
	
	}


11、*****一球从100米高度自由落下，
每次落地后反跳回原高度的一半；
再落下，求它在第10次落地时，
共经过多少米？第10次反弹多高？
(用程序实现)  
	*/
	double sum=0;
	double start=100;
	for(int i=1;i<=10;i++){
		//1-落下
		sum+=start;
		System.out.println("球第"+i+"次落下，落下了"+start+"米");
		//2-弹起
		start/=2;
		System.out.println("球第"+i+"次弹起，弹起了"+start+"米");
		sum+=start;
	}
	System.out.println("总共经过"+(sum-start)+"米。最后一次弹起的是"+start+"m");




	
		
	}
}
