class E 
{
	public static void main(String[] args) 
	{
		String[][] arr=new String[4][4];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]="��";
			}
		}
		/*
		arr[0][1]="��";
		arr[1][1]="��";
		arr[2][1]="��";
		arr[2][2]="��";
		*/
		arr[2][2]=arr[2][1]=arr[1][1]=arr[0][1]="��";
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		
	}
}
//