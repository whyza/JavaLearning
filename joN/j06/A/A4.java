class  A4
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1;i<=100;i++){
			sum = sum + i;
			if(sum>500){
				System.out.print(i);	
				break;
			}
		}
	}
}
