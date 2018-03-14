//1-输入一个数，判断奇偶数。
import java.util.Scanner;
class B{
public static void main(String[] args){
	System.out.println("输入一个数");
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	if(num%2==0){
	System.out.println(num+"是偶数");
	}else{
	System.out.println(num+"是奇数");
}


}

}