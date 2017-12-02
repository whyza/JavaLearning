package com.A.t1;

public class Test2 {
	public static void main(String[] args) {
		String str = "345_123_23";
		String[] arr = str.split("_");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			int j = Integer.parseInt(arr[i]);
			sum+=j;
		}
		System.out.println("ºÍÎª£º"+sum);
		
	}
}
