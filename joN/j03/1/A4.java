import java.util.Scanner;
class A4{
public static void main(String[] args){
	System.out.println("请依次输入三个0以上的整数");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	if(num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2){
	System.out.println("这是一个三角形");
	}else{
	System.out.println("不能构成三角形");
}
}


}