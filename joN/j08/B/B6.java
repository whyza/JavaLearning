import java.util.Scanner;
class B6 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		double[] arr = new double[5];
		Scanner  sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("���������");
			double num = sc.nextDouble();
			sum+=num;
			arr[i]=num;		
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
			System.out.println();
		}
		System.out.println("ƽ�����"+sum/5.0+"��");
	}
}
