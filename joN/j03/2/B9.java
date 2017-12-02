import java.util.Scanner;
class B9{
public static void main(String[] args){
	System.out.println("请输入营业额");
	Scanner sc = new Scanner(System.in);
	int salls = sc.nextInt();
	double jL = salls * 0.1;
	if(salls >= 50000){
	System.out.println("奖励"+jL+"元");
	}
	
}

}