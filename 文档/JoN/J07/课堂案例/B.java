//百钱买百鸡。公鸡=5   母鸡=3	小鸡一块钱三只
class B 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=20;i++){//公鸡数量
			for(int j=0;j<=33;j++){//母鸡
				for(int k=0;k<=100;k+=3){
					if(i+j+k==100 && i*5+j*3+k/3.0==100){
						System.out.println("公鸡="+i+"\t母鸡="+j+"\t小鸡="+k);
					}
				}
			}
		}
	}
}
