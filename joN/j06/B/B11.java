/*
11、*****一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？(用程序实现)  
*/
class B11 
{
	public static void main(String[] args) 
	{
		double sum = 100;
		for(int i=1;i<=10;i++){
			sum=sum/2.0;
		}
		System.out.println(sum);
	}
}
