/*
7.�����ɵ����������һ��1��100
(�����Լ�����)��һ���������
Ȼ����������£�
����´��ˣ����Ծ���ʾ�����ˡ���
�����С�ˣ����Ծ���ʾ��С�ˡ���
����¶��ˣ����Ծ���ʾ�����ˡ�
������������������¡�

*/
import java.util.*;
class AA 
{
	public static void main(String[] args) 
	{
		//1-���������
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		

		/*
		int res=r.nextInt(100)+1;

		//2-ѭ���������Ƚ�
		while(true){
			System.out.println("��£�");
			int input=in.nextInt();
			if(input>res){
				System.out.println("��´���");
				continue;
			}
			if(input<res){
				System.out.println("���С��");
				continue;
			}
			if(input==res){	//3-�¶�ֹͣѭ��
				System.out.println("��¶��ˣ��´����ϱϳԷ�����");
				break;
			}

		
		
		}


8.ʹ��while��ѯ���л�Ա����ϵͳ��
����ӭʹ�����в���ϵͳ��
����1,�������Ǯ,����2,
ȡ������Ǯ,����0.
�˳�ʱ���������ʣ�¶���Ǯ;

*/
/*
	int sum=0;
	while(1==1){
		System.out.println("��ӭʹ�����в���ϵͳ��1-��ȡ\t2-ȡǮ\t0-�˳�");
		int cmd=in.nextInt();
		if(cmd==1){
			System.out.println("�ֵ�������");
			int cq=in.nextInt();
			sum+=cq;
			System.out.println("���δ���"+cq+"��Ǯ����������"+sum+"��Ǯ");
		}else if(cmd==2){
			System.out.println("�ֵ���ȡ����");
			int qq=in.nextInt();
			sum-=qq;
			System.out.println("����ȡ��"+qq+"��Ǯ����������"+sum+"��Ǯ");
		}else if(cmd==0){
			System.out.println("��������"+sum+"��Ǯ");
			break;
		}else{
			System.out.println("�������");
		}
			 
	
	}


11��*****һ���100�׸߶��������£�
ÿ����غ�����ԭ�߶ȵ�һ�룻
�����£������ڵ�10�����ʱ��
�����������ף���10�η�����ߣ�
(�ó���ʵ��)  
	*/
	double sum=0;
	double start=100;
	for(int i=1;i<=10;i++){
		//1-����
		sum+=start;
		System.out.println("���"+i+"�����£�������"+start+"��");
		//2-����
		start/=2;
		System.out.println("���"+i+"�ε��𣬵�����"+start+"��");
		sum+=start;
	}
	System.out.println("�ܹ�����"+(sum-start)+"�ס����һ�ε������"+start+"m");




	
		
	}
}
