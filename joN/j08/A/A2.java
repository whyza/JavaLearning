import java.util.Scanner;
class A2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("������ѧ��"+(i+1)+"����");
			String an = sc.next();
			arr[i]=an;

		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}
}
