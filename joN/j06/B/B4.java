class  B4
{
	public static void main(String[] args) 
	{

		for(int i=1990;i<=2012;i++){
			if(i % 400 == 0 || i%4==0 && i%100!=0){
				System.out.print(i+"\t");
			}
		}
		
	}
}
