//����������ж���δ����С�����л���Ů 0-Ů  1-��   2-����
import java.util.Scanner;
import java.util.Random;
class Sex 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		System.out.println("����������������");
		String name=in.next();
//r.nextInt();//������Χ�ڵ������
		int sex=r.nextInt(3);
		switch(sex){
			case 0:
				System.out.println(name+"δ����С���ǡ�Ů������");
			break;
			case 1:
				System.out.println(name+"δ����С���ǡ��к�����");
			break;
			default:
				System.out.println(name+"δ����С���ǡ�������");
			

		}


	}
}
