import java.util.Scanner;
class W 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//求出某年某月跟1900-1-1相差了多少天
		//1900~某年的年份相差+某年1月到某年N月的相差天数
		System.out.println("欢迎使用1709班的万年历……");
		System.out.println("您想查看那一年？");
		int year=in.nextInt();
		System.out.println("您想查看"+year+"年的哪一月？");
		int month=in.nextInt();

		//1-求出相差天数
		int sum=0;
		//1.1-年份差距
		for(int i=1900;i<year;i++){
			if(i%4==0 && i%100!=0 || i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}

		//1.2-月份差距
		for(int i=1;i<month;i++){
			switch(i){
				case 2:
					if(year%4==0 && year%100!=0 || year%400==0){
						sum+=29;
					}else{
						sum+=28;
					}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum+=30;
				break;
				default:
					sum+=31;
			}
		}

		System.out.println(sum);
		//sum%7的结果。和星期几的关系是   余数+1
		int kgnum=(sum%7+1)%7;

		//2-打印表格
		//2.1-打印表头
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//2.2-打印空格
		for(int i=1;i<=kgnum;i++){
			System.out.print("\t");
		}
		//2.3-打印这个月所有的天数
		int days=31;
		switch(month){
			case 2:
			if(year%4==0 && year%100!=0 ||year %400==0){
				days=29;
			}else{
				days=28;
			}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
		}
		//
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if((i+kgnum)%7==0){
				System.out.println();
			}
		}

		
	}
}
