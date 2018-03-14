import java.util.Random;
class D 
{
	public static void main(String[] args) 
	{
 
		String[]arr={"☆","★","○","●","◎","◇","◆","□"};
		Random r=new Random();
		int sjxb=r.nextInt(arr.length);
		//1-随机一个符号作为本次答案
		String an=arr[sjxb];

		//打印从1-100；
		for(int i=1;i<=100;i++){
			if(i%9==0){
				System.out.print(i+":"+an+"\t");
			}else{
				//数字之后加一个随机符号
				int rand=r.nextInt(arr.length);//
				System.out.print(i+":"+arr[rand]+"\t");
			}


			if(i%10==0){
				System.out.println();
			}
		}
	}
}
