import java.util.Scanner;
class  B3
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("������...");
		int num = sc.nextInt();
		int	max=num;
		int	min=num;
		while(true){
			System.out.println("������...");
			num = sc.nextInt();
			if(num == 0){
				System.out.println("��ֹ");
				break;
			}
			if(num > max){
				max = num;
			}else if(num < min){
				min = num;
			}	
		}
		System.out.println("���ֵ"+max+"��Сֵ"+min);
	}
}
