//������Ľ�ʦ�ȼ����ж����нˮ

/*
1-4000
2-5000
3-8000
4-10000



*/
import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("�������Ľ�ʦ�ȼ�");
		int  level=in.nextInt();
		//���֧���жϡ�

//��ֵ�ж�~�����ж�
		switch(level){
			case 1:
				System.out.println("���ĵ�н��4000");
				break;
			case 2:
				System.out.println("���ĵ�н��5000");
				break;
			case 3:
				System.out.println("���ĵ�н��8000");
				break;
			case 4:
				System.out.println("���ĵ�н��10000");
				break;
			default:
				System.out.println("û�иõȼ�");
		}

		/*
		if(level==1){
			System.out.println("���ĵ�н��4000");
		}else if(level==2){
			System.out.println("���ĵ�н��5000");
		}else if(level==3){
			System.out.println("���ĵ�н��8000");
		}else if(level==4){
			System.out.println("���ĵ�н��10000");
		}else{
			System.out.println("û�иõȼ�");
		}
		*/
	}
}
