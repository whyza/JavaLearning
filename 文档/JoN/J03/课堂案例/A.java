//1-输入一个数，如果该数字以8结尾，我们就告诉你要发财了。
import java.util.Scanner;
class A{
public static void main(String[] args){

	//搬一台扫描仪过来
	Scanner wwm=new Scanner(System.in);
	//调用扫描仪的功能
	System.out.println("输入一个数");
	int a=wwm.nextInt();
	//判断是否8结尾
	if(a%10==8){
	System.out.println("winner winner chicken dinner");
	}


}

}