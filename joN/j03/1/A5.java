import java.util.Scanner;
class A5{
public static void main(String[] args){
	System.out.println("���������ķ���ƪ��");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("�������ʱ");
	int date = sc.nextInt();
	if((num >= 80 && num <= 100) && date >= 500 ){
	System.out.println("������Ϊ������");
	}else{
	System.out.println("��ʱ������Ϊ������");
	}	

}
}  	