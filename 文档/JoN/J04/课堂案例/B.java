//Ҫ���û������Լ����Ա�����Ա����У���˵���������ã������Ů���������Ƚ�
import java.util.Scanner;
class B 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ա�");
		String sex=in.next();
		if(sex.equals("��")){//"��".equals(sex)
			System.out.println("����������");
		}else{
			System.out.println("�������Ƚ�");
		}
	}
}
