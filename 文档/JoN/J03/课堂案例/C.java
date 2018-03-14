import java.util.Scanner;
class C{
	public static void main(String[] args){
	System.out.print("输入高考成绩");
	Scanner in=new Scanner(System.in);	
	int score=in.nextInt();
	if(score>=600){
	System.out.println("来农大");
	}else if(score>=500){
 	System.out.println("去哈佛");
	}else if(score>=400){
	System.out.println("学道学。");
	}else if(score>=300){
	System.out.println("做鸟人");
	}else{
	System.out.println("去搬砖");
	}


}

}