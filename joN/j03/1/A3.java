import java.util.Scanner;
class A3{
public static void main(String[] args){
	System.out.println("请输入一个整数");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num%2 == 0){
	System.out.println("这是偶数");
	}else{
	System.out.println("这是奇数");
	}
}


}