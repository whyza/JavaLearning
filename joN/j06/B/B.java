class B 
{
	public static void main(String[] args) 
	{
		
		for(int num=100;num < 999;num++){
			int g = num%10;
			int s = num/10%10;
			int b = num/100%10;
			if((g*g*g)+(s*s*s)+(b*b*b)==num){
				System.out.println(num+"是水仙花数");
			}
		}
	}
}
