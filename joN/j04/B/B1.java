import java.util.Scanner;
class B1 
{
	public static void main(String[] args) 
	{
		System.out.println("��������ӻ��۸�");
		Scanner sc = new  Scanner(System.in);
		double tvP = sc.nextDouble();
		System.out.println("���������۸�");
		double bxP = sc.nextDouble();
		double zP = tvP + bxP;
		if(zP < 100){
		System.out.println("�ܼ۸�С��100�������ۣ���֧����"+zP+"Ԫ");
		}else if(zP > 100 && zP <= 1000){
			System.out.println("����ۣ���֧����"+(zP*0.9)+"Ԫ");
		}else if(zP > 1000 && zP <= 5000){
			System.out.println("����ۣ���֧����"+(zP*0.8)+"Ԫ");
		}else if(zP > 5000){
			System.out.println("�����ۣ���֧����"+(zP*0.7)+"Ԫ");
		}
	}
}
