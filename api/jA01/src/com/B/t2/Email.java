package com.B.t2;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		String str = sc.next();
		// char[] arr=str.toCharArray();
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i]+"\t");
		// }
		// 8989898@qq.com
		// �ж������Ƿ����. @
		int n = str.indexOf(".");
		int n2 = str.lastIndexOf(".");
		System.out.println(n + " " + n2);
		int m = str.indexOf("@");
		if (n == -1 || m == -1) {
			System.out.println("���䲻����.��@");
		} else if (str.startsWith(".") == true || str.startsWith("@") == true) {
			System.out.println("�����ַ������. ��@��ͷ");
		} else if (m > n) {
			System.out.println(".������@֮ǰ����");
		} else if (n == m + 1) {
			System.out.println(".���ܽ���@�������");
		} else if (n2 != n) {
			System.out.println(".������������");
		} else if (str.endsWith(".com") == false && str.endsWith(".org") == false && str.endsWith(".net") == false
				&& str.endsWith(".cn") == false) {
			System.out.println("�����ַ������.com,.net,.cn,.org��β");
		} else {
			System.out.println("ע��ɹ��������ַΪ��" + str);
		}
	}

}
