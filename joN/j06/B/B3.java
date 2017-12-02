import java.util.Scanner;
class  B3
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入...");
		int num = sc.nextInt();
		int	max=num;
		int	min=num;
		while(true){
			System.out.println("请输入...");
			num = sc.nextInt();
			if(num == 0){
				System.out.println("终止");
				break;
			}
			if(num > max){
				max = num;
			}else if(num < min){
				min = num;
			}	
		}
		System.out.println("最大值"+max+"最小值"+min);
	}
}
