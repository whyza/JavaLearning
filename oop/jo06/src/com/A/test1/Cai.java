package com.A.test1;

import java.util.Scanner;

public class Cai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		A a = new A();
		while (true) {
			System.out.println("������-----");
			int num = sc.nextInt();
			if (num == a.v) {
				System.out.println("��ϲ��¶���");
				break;
			} else if (num > a.v) {
				System.out.println("̫����");
			} else{
				System.out.println("̫С��");
			}

		}
	}

}
