//1-������Ҫ����
//2-���������һ��
//3-�ж���Ӯ
import java.util.*;
class JSB 
{
	public static void main(String[] args) 
	{
		//׼������
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		//��ʼ
		System.out.println("������Ǹ���\n0-ʯͷ\t1-����\t2-��");
		int user=in.nextInt();
		//�����û�����ʲô
		switch(user){
			case 0:
				System.out.println("����ˡ�ʯͷ��");
			break;
			case 1:
				System.out.println("����ˡ�������");
			break;
			case 2:
				System.out.println("����ˡ�����");
		}

		int com=r.nextInt(3);
		switch(com){
			case 0:
				System.out.println("���Գ��ˡ�ʯͷ��");
			break;
			case 1:
				System.out.println("���Գ��ˡ�������");
			break;
			case 2:
				System.out.println("���Գ��ˡ�����");
		}

		int res=user-com;
		if(res==0){
			System.out.println("ƽ��");
		}else if(res==-1 || res==2){
			System.out.println("��Ӯ��");
		}else{
			System.out.println("������");
		}






	}
}
/*
\n0-ʯͷ\t1-����\t2-��;

Y	C	R	����
0	0	p	0
0	1	w	-1
0	2	l	-2
1	0	l	1
1	1	p	0
1	2	w	-1
2	0	w	2
2	1	l	1
2	2	p	0



*/
