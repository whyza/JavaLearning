import java.util.Scanner;
class  A3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int grade,sum = 0;
		int count = 1;
		for(int i=1;i<=5;i++){	
			System.out.println("�������"+count+"�ųɼ�");
			count++;
			grade = sc.nextInt();
			if(grade < 0){
				System.out.println("��������");
				return;
			}else{
				sum+=grade;	
			}
		}
		System.out.println("�ܷ�"+sum);	
	}
}
