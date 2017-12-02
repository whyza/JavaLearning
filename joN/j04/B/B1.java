import java.util.Scanner;
class B1 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入电视机价格");
		Scanner sc = new  Scanner(System.in);
		double tvP = sc.nextDouble();
		System.out.println("请输入冰箱价格");
		double bxP = sc.nextDouble();
		double zP = tvP + bxP;
		if(zP < 100){
		System.out.println("总价格小于100，不打折，需支付："+zP+"元");
		}else if(zP > 100 && zP <= 1000){
			System.out.println("打九折，需支付："+(zP*0.9)+"元");
		}else if(zP > 1000 && zP <= 5000){
			System.out.println("打八折，需支付："+(zP*0.8)+"元");
		}else if(zP > 5000){
			System.out.println("打七折，需支付："+(zP*0.7)+"元");
		}
	}
}
