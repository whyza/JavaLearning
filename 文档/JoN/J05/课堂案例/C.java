//求1+2+3+……87的结果

//1+1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10=?
class C 
{
	public static void main(String[] args) 
	{
		int a=1;
		double sum=0;
		while(a<=10){
			sum=sum+1.0/a;
			a=a+1;
		}
System.out.println(sum);

		/*
		int a=1;
		int sum=0;
		while(a<=100){
			sum=sum+a;
			a=a+1;
		}
		System.out.println(sum);
		*/
	}
}
