class E 
{
	public static void main(String[] args) 
	{
		//a=a+1;
		int a=1;
		/*
		a++;//�ȼ���a=a+1;
		++a;//�ȼ���a=a+1;
		*/
		//int b=(a++)+(++a)+(a++)+(++a);
		int b=(--a)+(a++)+(++a)+(a--);
		System.out.println(b+"---"+a);
	}
}
