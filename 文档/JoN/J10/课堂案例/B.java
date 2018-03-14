class B 
{
	public static void main(String[] args) 
	{
		int[][] arr=new int[2][4];
		arr[0][0]=22;

		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		
		}
	}
}
