import java.util.Scanner;
class D{
	public static void main(String[] args){

	Scanner in=new Scanner(System.in);
	System.out.print("输入笔试成绩");
	int bs=in.nextInt();
	if(bs>=80){
		System.out.print("输入面试成绩");
		int ms=in.nextInt();
		if(ms>=80){
		System.out.print("录取");
		}else{
		System.out.print("教育体制的悲哀。");
		}
	}else{
	System.out.print("回去多读书");
	}
}
}