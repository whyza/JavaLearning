import java.util.Random;
class B5 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int jcount = 0;
		Random r = new Random();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			int num = r.nextInt(101);
			arr[i]=num;
		if(arr[i]%2==0){
			System.out.println(arr[i]+"是偶数");
			count++;
		}else if(arr[i]%2!=0){
			System.out.println(arr[i]+"是奇数");
			jcount++;
		}
		}
		System.out.println("总共有"+count+"个偶数");
		System.out.println("总共有"+jcount+"个奇数");
	}
}
