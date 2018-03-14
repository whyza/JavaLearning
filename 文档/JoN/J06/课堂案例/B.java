class B 
{
	public static void main(String[] args) 
	{
		int max=50;
		int count=1;
		do{
			System.out.println("吃了第"+count+"碗粉！");
			count++;
			max-=5;
		}while(max>=5);

		/*
		while(max>=5){
			System.out.println("吃了第"+count+"碗粉！");
			max-=5;
			count++;
		}
		*/
		
	}
}
