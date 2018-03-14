/*

i	s=5-i	x=2*i-1
    *		1=(4s+1x)	
   ***		2=(3s+3x)
  *****		3=(2s+5x)
 *******	4=(1s+7x)
*********	5=(0s+9x)

*/

class C 
{
	public static void main(String[] args) 
	{
		/*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		for(int i=1;i<=5;i++){
			//´òÓ¡¿Õ¸ñ
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			//´òÓ¡**
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
