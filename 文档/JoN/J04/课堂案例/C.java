/*
1-��������Ů��
2-���ǼҼ����ˡ�����>=3
3-���䡣age<19 &&age>14
//4-��Χ�͡�sum>=240
5-���ء�tz<=120
6-��� ��1.60~1.70
��һ��
*/
import java.util.Scanner;
class C 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("���һ�����졣�����������ǳ���");
		System.out.println("===========================");
		System.out.println("������������Ů��");
		String sex=in.next();
		if("Ů".equals(sex)){
			System.out.println("���ǼҼ�����?");
			int num=in.nextInt();
			if(num>=3){
				System.out.println("���伸��");
				int age=in.nextInt();
				if(age>14 &&  age<=19){
						System.out.println("����ء���");
						double w=in.nextDouble();
						if(w<=120){
							System.out.println("������");
							double sg=in.nextDouble();
							if(sg>=1.60 && sg<=1.70){
								System.out.println("��һ��");
							}else{
								System.out.println("��ܡ�������");
							}
						}else{
							System.out.println("����ѹ���ҡ���");
						}
				}else{
				System.out.println("���䲻����");
				}
			}else{
				System.out.println("�������ﲻ���֡���");
			}
		}else{
			System.out.println("�����?");
			String gj=in.next();
			if("��".equals(gj)){
				System.out.println("�պ�һ��");
			}else{
				System.out.println("�񾭲�");
			}
		}
	
	}
}
