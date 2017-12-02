/*
   *        3   1
  ***		2	3
 *****		1	5
*******		0	7
 *****      1	5	 i=5 j=5
  ***       2	3	 i=6 j=3	
   *		3	1		


*/
class  A10
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++){
			//¿Õ¸ñ
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}	
			// ***
			for(int j=1;j<=2*i-1 && i<=4;j++){
				System.out.print("*");
			}
				System.out.println("");
		}
			for(int k=1;k<=3;k++){
				for(int j=1;j<=k;j++){
				System.out.print(" ");
			}
				for(int j=5;j>=2*k-1;j--){
				System.out.print("*");
				}
				System.out.println("");
			}
			
			
	}
}
