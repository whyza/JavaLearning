/*
--������
*/
import java.util.Random;
class A7 
{
	public static void main(String[] args) 
	{
		String[] arr={"��","��","��","��","��","��","��","��"};
		Random r = new Random();
		int num = r.nextInt(arr.length);
		String an = arr[num];
		/*
		for(int i=0;i<arr.length;i++){
			
			arr[i]=arr[num];
		}*/
		//���1--100
		for(int i=1;i<=100;i++){
			if(i%9==0){
				System.out.print(i+":"+an+"\t");
			}else{
				int rand = r.nextInt(arr.length);
				System.out.print(i+":"+arr[rand]+"\t");
			}

			if(i%10==0){
				System.out.println();
			}
	}
}
}