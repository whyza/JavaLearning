package com.B;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.next();
		char[] arr = str.toCharArray();
		System.out.println(arr[0]);
//		char c = str.charAt(0);
		if(!Character.isLowerCase(arr[0])) {
			System.out.println("��д");
		}else {
			System.out.println("�Ǵ�д");
		}
	}
}
