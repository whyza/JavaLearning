import java.util.Scanner;
class A5 
{
	public static void main(String[] args) 
	{
		System.out.println("是否为会员？");
		Scanner sc = new Scanner(System.in);
		String yN = sc.next();
		if(yN.equals("是")){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("请输入购物金额：");
			double nUser = sc1.nextDouble();
			if(nUser > 100 && nUser < 200){
				double money = nUser*0.8;
				System.out.println("会员打八折："+money+"元");
			}else if(nUser > 200){
				double m = nUser*0.75;
				System.out.println("满200打7.5折："+m+"元");
			}
		}else if(yN.equals("否")){
			Scanner sc2 = new Scanner(System.in);
			System.out.println("请输入购物金额：");
			double nUser1 = sc2.nextDouble();
			double money1 = nUser1*0.9;
			System.out.println("打九折后："+money1+"元");

		}
	}
}
