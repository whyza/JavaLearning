import java.util.Scanner;
class A7{
public static void main(String[]  args){
	System.out.println("请输入会员积分");
	Scanner sc = new Scanner(System.in);
	int zJ = 1000;
	int jF = sc.nextInt();
	if(jF > 5000){
	System.out.println("优惠七折后："+zJ*0.7+"元 ");
	}else if(jF > 3000 && jF < 5000){
	System.out.println("优惠八折后："+zJ*0.8+"元 ");
	}else if(jF > 1000 && jF < 3000){
	System.out.println("优惠八折后："+zJ*0.9+"元");
	}
}

}