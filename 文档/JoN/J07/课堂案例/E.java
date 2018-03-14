//2017-10-14
class E 
{
	public static void main(String[] args) 
	{
		//求出今年1到9月份的每个月分的天数，然后累加
		int sum=0;
		for(int i=1;i<=9;i++){
			//求出i月份有多少天
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					sum+=31;
				break;
				case 2:
					sum+=28;
				break;
				default:
					sum+=30;
			}
			//System.out.println("-==========="+i);
		}
		sum+=14;
		System.out.println("您的2017年已经过了"+sum*100/365+"%");
	}
}
