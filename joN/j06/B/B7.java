import java.util.Scanner;
import java.util.Random;
class  B7
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		for(int i=1;i<=10;i++){
		   int num = r.nextInt(101);
		   if(num%2==0){
			System.out.println(num);
		   }
		}
	} 
}
