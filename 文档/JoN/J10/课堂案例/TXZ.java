import java.util.Scanner;
class TXZ 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//��ʼ����ͼ
		String[][] arr=new String[15][15];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]="��";
			}
		}
		//��ʼ���˵�λ��
		int rx=0,ry=0;
		//��ʼ�����ӵ�λ��
		int xx=7,xy=8;

		//��ʼ���յ��λ��
		int zx=7,zy=12;

		arr[ry][rx]="��";//
		arr[xy][xx]="��";

		arr[zy][zx]="��";
		while(true){
			System.out.print("�ֵ����Ķ���?\twasd" );
			String cmd=in.next();
			if("w".equals(cmd)){
			
			}else if("a".equals(cmd)){
			
			}else if("s".equals(cmd)){
				arr[ry][rx]="��";
				ry++;
				if(ry>=15){
					ry--;
				}
				arr[ry][rx]="��";//�˳ɹ�����
				if(rx==xx && ry==xy){//��������
					xy++;
					if(xy>=15){
						xy--;
						ry--;
					}
					arr[ry][rx]="��";
					arr[xy][xx]="��";//���ӳ��ƶ�
					if(xx==zx && xy==zy){
						break;
					}
				
				
				}

				
			}else if("d".equals(cmd)){
				arr[ry][rx]="��";
				rx++;
				if(rx>=15){
					rx--;
				}
				arr[ry][rx]="��";

				if(rx==xx && ry==xy){//��������
					xx++;
					if(xx>=15){
						xx--;
						ry--;
					}
					arr[ry][rx]="��";
					arr[xy][xx]="��";
				
				
				}

			}else{
			//
				System.out.println("�������");
			}

			//��ӡ��ͼ
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}

		//��ӡ��ͼ
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}


		System.out.println("winner winner chicken dinner!");
		
	}
}
