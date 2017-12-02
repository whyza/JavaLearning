/*
3    将一个整形二维数组赋值为如下形式：
 	1 2 3  4	
	2 4 6  8
	3 6 9  12
	4 8 12 16
*/
class A3 
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[4][4];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
