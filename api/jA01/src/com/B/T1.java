package com.B;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.next();
		char[] arr = str.toCharArray();
		System.out.println(arr[0]);
//		char c = str.charAt(0);
		if(!Character.isLowerCase(arr[0])) {
			System.out.println("大写");
		}else {
			System.out.println("非大写");
		}
	}
}
