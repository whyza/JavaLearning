/*

			x=y+z		y=4-x	z=2*x-1
    *		1=3+1
   ***		2=2+3
  *****		3=1+5
 *******	4=0+7
  *****		3=1+5		y=4-x	 z=2*x-1
   ***      2=2+3; 
    *		1=3+1;


*/

class BB 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++){
			for(int  j=1;j<=4-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
