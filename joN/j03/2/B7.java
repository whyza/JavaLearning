import java.util.Scanner;
class B7{
public static void main(String[] args){
	System.out.println("请输入成绩");
	Scanner sc = new Scanner(System.in);
	double grade = sc.nextDouble();
	if(grade >= 60){
	System.out.println("您的成绩是否及格： ture");
	}else{
	System.out.println("您的成绩是否及格： false");
	}
}

}