import java.util.Random;
class B9 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		while(true){
			int num = r.nextInt(21);
			if(num == 0){
				break;
			}else{
			System.out.print(num+"\t");
			}
		}
	}
}
