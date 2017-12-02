/*
求：1，1，2，3，5，8，13，。。。。 的前30个
	i+(i+1)=(i+2)


*/

class A5 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[30];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
