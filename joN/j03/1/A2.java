import java.util.Scanner;
class A2{
public static void main(String[] args){
	System.out.println("请输入性别 ‘男’or ‘女’");	
	Scanner sc = new Scanner(System.in);
	String sex = sc.next();
	if(sex.equals("男")){
	System.out.println("你是男人");
	}else{
	System.out.println("你不是男人");
	}

}
}