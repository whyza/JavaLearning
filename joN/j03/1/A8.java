import java.util.Scanner;
class A8{
public static void main(String[] args){
	System.out.println("������һ������");
	Scanner sc = new Scanner(System.in);
	int userNum =  sc.nextInt();
	if(userNum == 1){
	System.out.println("���� �ÿ�");	
	}else if(userNum == 2){
	System.out.println("��֭ ����");
	}else if(userNum == 3){
	System.out.println("ơ�� ������");
	}else {
	System.out.println("û����������");
	}

}
}