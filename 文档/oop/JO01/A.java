class A 
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[5][5];
		//1-每行第一个数是1.
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
		}
		//每行和列相等的时候是1
		
		//第二行开始，第一个数往后，等于上面的数+上面前面的
		for(int i=1;i<arr.length;i++){
			for(int j=1;j<=i;j++){
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
		}
		
		System.out.println("Hello World!");
	}
}
