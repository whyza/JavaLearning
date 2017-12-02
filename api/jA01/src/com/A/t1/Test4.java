package com.A.t1;
/*4、str="123A456";
 * 请将"123"和"456"分别从str中取出，求两者和的值*/
public class Test4 {
	public static void main(String[] args) {
		String str = "123A456";
		String[] arr = str.split("A");
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			int j = Integer.parseInt(arr[i]);
			sum+=j;
		}
		System.out.println(arr[0]+"+"+arr[1]+"="+sum);
	}
}
