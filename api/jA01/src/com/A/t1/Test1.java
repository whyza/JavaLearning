package com.A.t1;

public class Test1 {
	public static void main(String[] args) {
		String str = "  hello  ";
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		System.out.println("str变量的字符串一共有"+str1.length()+"个字符");
	}
}
