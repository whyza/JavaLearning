class A4 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,3,9,2},{2,7,6,3},{5,4,1,1},{6,8,8,2}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int sum=arr[0][0]+arr[1][1]+arr[2][2]+arr[3][3]+arr[0][3]+arr[1][2]+arr[2][1]+arr[3][0];
		System.out.println(sum);
		}
}
