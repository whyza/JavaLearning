import java.util.Scanner;
class A6{
public static void main(String[] args){
	System.out.println("����������");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if(age >= 0 && age <= 18){
	System.out.println("������");
	}else if(age >= 19 && age <= 40){
	System.out.println("����");
	}else if(age >= 41 && age <= 60){
	System.out.println("����");
	}else if(age >= 60 && age <= 150){
	System.out.println("����");
	}else if(age > 150){
	System.out.println("����");
	}
}
}  	