package com.d;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stu.b++;
		
		
		Stu s1=new Stu();
		s1.a++;
		s1.b++;
		
		System.out.println(s1.a);
		System.out.println(s1.b);
		Stu s2=new Stu();
		
		s2.a++;
		s2.b++;
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s1.b);
	}

}
