import java.util.Scanner;
class W 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//���ĳ��ĳ�¸�1900-1-1����˶�����
		//1900~ĳ���������+ĳ��1�µ�ĳ��N�µ��������
		System.out.println("��ӭʹ��1709�������������");
		System.out.println("����鿴��һ�ꣿ");
		int year=in.nextInt();
		System.out.println("����鿴"+year+"�����һ�£�");
		int month=in.nextInt();

		//1-����������
		int sum=0;
		//1.1-��ݲ��
		for(int i=1900;i<year;i++){
			if(i%4==0 && i%100!=0 || i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}

		//1.2-�·ݲ��
		for(int i=1;i<month;i++){
			switch(i){
				case 2:
					if(year%4==0 && year%100!=0 || year%400==0){
						sum+=29;
					}else{
						sum+=28;
					}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum+=30;
				break;
				default:
					sum+=31;
			}
		}

		System.out.println(sum);
		//sum%7�Ľ���������ڼ��Ĺ�ϵ��   ����+1
		int kgnum=(sum%7+1)%7;

		//2-��ӡ���
		//2.1-��ӡ��ͷ
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//2.2-��ӡ�ո�
		for(int i=1;i<=kgnum;i++){
			System.out.print("\t");
		}
		//2.3-��ӡ��������е�����
		int days=31;
		switch(month){
			case 2:
			if(year%4==0 && year%100!=0 ||year %400==0){
				days=29;
			}else{
				days=28;
			}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
		}
		//
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if((i+kgnum)%7==0){
				System.out.println();
			}
		}

		
	}
}
