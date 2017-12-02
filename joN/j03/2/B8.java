import java.util.Scanner;
class B8{
public static void main(String[] args){
	System.out.println("请输入成绩");
	Scanner sc = new Scanner(System.in);
	int grade = sc.nextInt();
	if(grade >= 60){
	System.out.println("难道我是大神");
	}else{
	System.out.println("身为一个菜鸟，还是应该努力学习");
	}
	
}

}