import java.util.*;
class  A7
{
	public static void main(String[] args) 
	{
		System.out.println("����������С��");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		int intNum = (int)num1;	
		double dNum  = num1-intNum;
		System.out.println("С������Ϊ��"+dNum);
		int intNum1 = (int)num2;	
		double dNum1  = num2-intNum1;
		System.out.println("С������Ϊ��"+dNum1);
		if(intNum + intNum1 > 10){
			double dNum3 = dNum + dNum1;
			System.out.println("С�����ֺ�Ϊ��"+dNum3);
			if(dNum3 >= 1.0){
				System.out.println("С�����ֺʹ���1.0");
			}else {
				System.out.println("С�����ֺ�С��1.0");
			}	

		}else if(intNum + intNum1 <= 10){
			double dNum4 = dNum - dNum1;
			System.out.println("С�����ֲ�Ϊ��"+dNum4);
			if(dNum4 > 0){
			System.out.println("С�����ֲ����0.0");
			}else{
				System.out.println("С�����ֲ�С��0.0");
			}
		}
	}
}
