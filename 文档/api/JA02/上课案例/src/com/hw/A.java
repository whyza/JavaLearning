package com.hw;

public class A {
/**
 * 3、Email地址验证:
建议最好不要把所有的判断都写在一起,把判断拆分处理
1:必定包含.和@
2:.和@不能位于首尾
3:.可以出现多次,但@只能一次
4:.不能在@之前出现
5:.不能紧接@后面出现
6:.不能连续出现
7:末尾必须是.com,.net,.cn,.org结尾


 * @param args
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="7207542@qq.com";
		
//		1:必定包含.和@
		if(email.indexOf(".")<=0 || email.indexOf("@")<=0){
			System.out.println("邮箱不合法");
			return;
		}
//		2:.和@不能位于首尾
		if(email.lastIndexOf(".")==email.length()-1 ||email.lastIndexOf("@")==email.length()-1){
			System.out.println("邮箱不合法");
			return;
			
		}
		
//		3:.可以出现多次,但@只能一次
		if(email.indexOf("@")!=email.lastIndexOf("@")){
			System.out.println("邮箱不合法");
			return;
			
		}
		
		
//		4:.不能在@之前出现
		if(email.indexOf(".")< email.indexOf("@")){
			System.out.println("邮箱不合法");
			return;
		}
		
//		5:.不能紧接@后面出现
		if(email.indexOf("@.")>0){
			System.out.println("邮箱不合法");
			return;
		}
		
//		6:.不能连续出现
//		7:末尾必须是.com,.net,.cn,.org结尾
		if(!(email.endsWith(".com") || email.endsWith(".net") ||email.endsWith(".cn")||email.endsWith(".org")))
		{	System.out.println("邮箱不合法");
		return;
			
		}
		
		System.out.println("合法");
		
	}

}
