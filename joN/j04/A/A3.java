import java.util.Scanner;
class A3{
public static void main(String[] args){
	System.out.println("��������Ʒ�۸�");
	Scanner sc = new Scanner(System.in);
	double price = sc.nextDouble();
	if(price >= 100 && price < 500){
		System.out.println("����ۺ�"+price*0.9);
	}else if(price >= 500){
		System.out.println("����ۺ�"+price*0.8);
	}else{
		System.out.println("������"+price);
	}

}

}