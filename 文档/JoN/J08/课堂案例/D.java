import java.util.Random;
class D 
{
	public static void main(String[] args) 
	{
 
		String[]arr={"��","��","��","��","��","��","��","��"};
		Random r=new Random();
		int sjxb=r.nextInt(arr.length);
		//1-���һ��������Ϊ���δ�
		String an=arr[sjxb];

		//��ӡ��1-100��
		for(int i=1;i<=100;i++){
			if(i%9==0){
				System.out.print(i+":"+an+"\t");
			}else{
				//����֮���һ���������
				int rand=r.nextInt(arr.length);//
				System.out.print(i+":"+arr[rand]+"\t");
			}


			if(i%10==0){
				System.out.println();
			}
		}
	}
}
