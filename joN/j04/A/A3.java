import java.util.Scanner;
class A3{
public static void main(String[] args){
	System.out.println("请输入商品价格");
	Scanner sc = new Scanner(System.in);
	double price = sc.nextDouble();
	if(price >= 100 && price < 500){
		System.out.println("打九折后："+price*0.9);
	}else if(price >= 500){
		System.out.println("打八折后："+price*0.8);
	}else{
		System.out.println("不打折"+price);
	}

}

}