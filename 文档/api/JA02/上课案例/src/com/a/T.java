package com.a;

public class T {

	public T() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a1 = "abc";
		String a2 = "abc";

		String a3 = new String("abc");
		String a4 = new String("abc");

		if (a1 == a2) {
			System.out.println("a1==a2");
		}

		if (a1.equals(a2)) {
			System.out.println("a1.equals(a2)");
		}

		if (a3 == a4) {
			System.out.println("a3==a4");

		}
		if (a3.equals(a4)) {
			System.out.println("a4.equals(a3)");
		}

		if (a1 == a3) {
			System.out.println("a1==a3");
		}

		if (a1.equals(a3)) {
			System.out.println("a1.equals(a3)");

		}

	}

}
