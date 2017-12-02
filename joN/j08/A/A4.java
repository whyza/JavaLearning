import java.util.Random;
class A4 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[13];
		Random r =  new Random();
		for(int i=0;i<arr.length;i++){
			int num = r.nextInt(13)+1;
			arr[i]=num;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
