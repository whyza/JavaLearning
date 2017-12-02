package com.A.test1;

import java.util.Scanner;

public class Cai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		A a = new A();
		while (true) {
			System.out.println("请输入-----");
			int num = sc.nextInt();
			if (num == a.v) {
				System.out.println("恭喜你猜对了");
				break;
			} else if (num > a.v) {
				System.out.println("太大了");
			} else{
				System.out.println("太小了");
			}

		}
	}

}
