import java.util.*;
class WNL 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("�������");
		int y=in.nextInt();
		System.out.println("�����·�");
		int m=in.nextInt();
		//1-�������������ո�����
		int sum=0;
		for(int i=1900;i<y;i++){
			if(i%4==0&& i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}

		for(int i=1;i<m;i++){
			switch(i){
			case 2:
				if(y%4==0&&y%100!=0||y%400==0){
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
		int kg=(sum%7+1)%7;

		int days=31;
		switch(m){
			case 2:
				if(y%4==0&&y%100!=0||y%400==0){
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


		//��ӡ
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=kg;i++){
				System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if((i+kg)%7==0){
			System.out.println();
			}
		}


	}
}
