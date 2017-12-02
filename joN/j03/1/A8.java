import java.util.Scanner;
class A8{
public static void main(String[] args){
	System.out.println("请输入一个数字");
	Scanner sc = new Scanner(System.in);
	int userNum =  sc.nextInt();
	if(userNum == 1){
	System.out.println("咖啡 好苦");	
	}else if(userNum == 2){
	System.out.println("果汁 好甜");
	}else if(userNum == 3){
	System.out.println("啤酒 喝醉了");
	}else {
	System.out.println("没有其他饮料");
	}

}
}