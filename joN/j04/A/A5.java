import java.util.Scanner;
class A5 
{
	public static void main(String[] args) 
	{
		System.out.println("�Ƿ�Ϊ��Ա��");
		Scanner sc = new Scanner(System.in);
		String yN = sc.next();
		if(yN.equals("��")){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("�����빺���");
			double nUser = sc1.nextDouble();
			if(nUser > 100 && nUser < 200){
				double money = nUser*0.8;
				System.out.println("��Ա����ۣ�"+money+"Ԫ");
			}else if(nUser > 200){
				double m = nUser*0.75;
				System.out.println("��200��7.5�ۣ�"+m+"Ԫ");
			}
		}else if(yN.equals("��")){
			Scanner sc2 = new Scanner(System.in);
			System.out.println("�����빺���");
			double nUser1 = sc2.nextDouble();
			double money1 = nUser1*0.9;
			System.out.println("����ۺ�"+money1+"Ԫ");

		}
	}
}
