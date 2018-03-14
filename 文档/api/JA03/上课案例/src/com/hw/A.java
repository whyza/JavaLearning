package com.hw;

import java.util.Scanner;

/*
 * 3、给一个长度为6的整数密码加密
1）	提示输入一个长度为6的整数密码
2）	根据提供的密码进行加密
3）	加密规则如下:
如原始密码为:123456---加密密码为:178906
如原始密码为:492845—加密密码为:447395
4）	最后打印原始密码和加密密码

 */
public class A {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("输入六位数密码");
		String password=in.next();
		StringBuffer sb=new StringBuffer();
		String res="";
		//追加第一个
		res+=password.charAt(0);
	//	sb.append(password.charAt(0));
		//1-4
		for (int i = 1; i <= 4; i++) {
			int temp=Integer.parseInt(password.charAt(i)+"");
			temp=(temp+5)%10;
			res+=temp;
		}
		//追加最后一个
		res+=password.charAt(password.length()-1);
		
		System.out.println(res);
		

	}

}
