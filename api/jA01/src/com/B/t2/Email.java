package com.B.t2;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱");
		String str = sc.next();
		// char[] arr=str.toCharArray();
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i]+"\t");
		// }
		// 8989898@qq.com
		// 判断邮箱是否包含. @
		int n = str.indexOf(".");
		int n2 = str.lastIndexOf(".");
		System.out.println(n + " " + n2);
		int m = str.indexOf("@");
		if (n == -1 || m == -1) {
			System.out.println("邮箱不包含.或@");
		} else if (str.startsWith(".") == true || str.startsWith("@") == true) {
			System.out.println("邮箱地址不能以. 或@开头");
		} else if (m > n) {
			System.out.println(".不能在@之前出现");
		} else if (n == m + 1) {
			System.out.println(".不能紧接@后面出现");
		} else if (n2 != n) {
			System.out.println(".不能连续出现");
		} else if (str.endsWith(".com") == false && str.endsWith(".org") == false && str.endsWith(".net") == false
				&& str.endsWith(".cn") == false) {
			System.out.println("邮箱地址必须是.com,.net,.cn,.org结尾");
		} else {
			System.out.println("注册成功：邮箱地址为：" + str);
		}
	}

}
