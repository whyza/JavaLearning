//���ͽܿ�������BOSS
import java.util.*;
class VS 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		//��ʼ����Ϸ��������
		int WHP=1000,LHP=50000;
		int WAT=0,LAT=0;
		int count=1;
		System.out.println("ͻȻ������boss������");
		while(true){
			System.out.println("������������ǰ��"+count+"�غϡ�������");
			System.out.println("1-����\t2-����\t3-����\t4-����");//��ӡ�˵�
			int cmd=in.nextInt();
			//�жϲ˵�ѡ��
			if(cmd==1){//��ͨ����
				WAT=5000+r.nextInt(10001);
				LAT=r.nextInt(401);
				//����--��Ѫ�Ĺ���
				LHP-=WAT;
				System.out.println("���ͽ�ʹ�á��������졿,�����õ���["+WAT+"],��ʣ"+LHP+"��Ѫ��");
				WHP-=LAT;
				System.out.println("������ʹ�á�����Сȭȭ��,���ͽܵ���["+LAT+"],��ʣ"+WHP+"��Ѫ��");
			
				if(WHP<=0 && LHP<=0){
					System.out.println("���˶�������������������������");
					break;
				}
				if(LHP<=0){
					System.out.println("а���boss�����ñ���������ͽܻ����ˡ���þ���1�㣬��Ǯ2G������װ���������Сȭ�ס�");
					break;
				}
				if(WHP<=0){
					System.out.println("ʤ���˱��ҳ��£�����������������");
					break;
				}
			}else if(cmd==2){//ʹ�ü���
				System.out.println("ѡ����:1-˲ɱն\t2-�¿�ˮ\3-����������");
				int cmdjn=in.nextInt();
				if(cmdjn==1){//˲ɱն
					//10%�ĸ���
					if(r.nextInt(100)<10){
						WAT=LHP;
					}else{
						WAT=0;
					}
				LAT=r.nextInt(401);
				//����--��Ѫ�Ĺ���
				LHP-=WAT;
				System.out.println("���ͽ�ʹ�á�˲ɱն��,�����õ���["+WAT+"],��ʣ"+LHP+"��Ѫ��");
				WHP-=LAT;
				System.out.println("������ʹ�á�����Сȭȭ��,���ͽܵ���["+LAT+"],��ʣ"+WHP+"��Ѫ��");
			
				if(WHP<=0 && LHP<=0){
					System.out.println("���˶�������������������������");
					break;
				}
				if(LHP<=0){
					System.out.println("а���boss�����ñ���������ͽܻ����ˡ���þ���1�㣬��Ǯ2G������װ���������Сȭ�ס�");
					break;
				}
				if(WHP<=0){
					System.out.println("ʤ���˱��ҳ��£�����������������");
					break;
				}
				}else if(cmdjn==2){
				
				
				}else if(cmdjn==3){
				
				}else{
				
				
				}
			
			}else if(cmd==3){
			
			}else if(cmd==4){
			
			}else{
				System.out.println("ɵ����Ϲ������");
			}
		}
	}
}
