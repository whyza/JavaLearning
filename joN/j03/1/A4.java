import java.util.Scanner;
class A4{
public static void main(String[] args){
	System.out.println("��������������0���ϵ�����");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if(num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2){
	System.out.println("����һ��������");
	}else{
	System.out.println("���ܹ���������");
}
}


}