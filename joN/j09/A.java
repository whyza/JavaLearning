import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		int[] arr  =  {2,30,11,20,99};
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("������һ������");
			int num = sc.nextInt();
			for(int i=0;i<arr.length;i++){
				if(num==arr[i]){
					System.out.println("�����ܴ������֣�"+num+"����Ϊ"+i);
					return;
				}else if(num!=arr[i]){
					System.out.println("�޴�����");
					break;
				}
			}
		}
	}
}