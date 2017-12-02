import java.util.Scanner;
class A1{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个数");
	int num = sc.nextInt();
	if(num > 0){
	System.out.println("正数");
	}else{
	System.out.println("非正数");			
	}
}


}