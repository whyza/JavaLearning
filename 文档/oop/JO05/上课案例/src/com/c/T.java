package com.c;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int[] arr={1,2};
		Stu s=new Stu();
		s.a=1;
		Math m=new Math();
		m.add(a);
		m.add(arr);
		m.add(s);
		System.out.println(a);
		System.out.println(arr[0]);
		System.out.println(s.a);
	}

}
