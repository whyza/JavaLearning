import java.util.Scanner;
class A5{
public static void main(String[] args){
	System.out.println("请输入论文发表篇数");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println("请输入课时");
	int date = sc.nextInt();
	if((num >= 80 && num <= 100) && date >= 500 ){
	System.out.println("可以评为副教授");
	}else{
	System.out.println("暂时不能评为副教授");
	}	

}
}  	