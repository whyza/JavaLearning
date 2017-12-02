import java.util.Scanner;
class A8 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int n,m;
		int i;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("输入1--存钱，2取钱S");
			i = sc.nextInt();
			if(i == 1){
				System.out.println("请输入存钱数");
				n = sc.nextInt();
				sum+=n;
				System.out.println("余额"+sum);
				continue;
			}else if(i == 2){
				System.out.println("请输入取钱数");
				m = sc.nextInt();
				sum-=m;
				System.out.println("余额"+sum);
				continue;
			}else if(i == 0){
				System.out.println("退出,剩余"+sum+"元");	
				break;
			}else{
				System.out.println("输入有误");	
				break;
			}
		
		}
		
	}
}
