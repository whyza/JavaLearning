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
		System.out.println("����1--��Ǯ��2ȡǮS");
			i = sc.nextInt();
			if(i == 1){
				System.out.println("�������Ǯ��");
				n = sc.nextInt();
				sum+=n;
				System.out.println("���"+sum);
				continue;
			}else if(i == 2){
				System.out.println("������ȡǮ��");
				m = sc.nextInt();
				sum-=m;
				System.out.println("���"+sum);
				continue;
			}else if(i == 0){
				System.out.println("�˳�,ʣ��"+sum+"Ԫ");	
				break;
			}else{
				System.out.println("��������");	
				break;
			}
		
		}
		
	}
}
