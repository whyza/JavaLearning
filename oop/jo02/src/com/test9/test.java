package com.test9;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1 = new Square();
		s1.setSide(2);
		System.out.println(s1.GetMianJi());
		System.out.println(s1.GetZhouChang());
		Square s2 = new Square(10);
		System.out.println(s2.GetMianJi());
		System.out.println(s2.GetZhouChang());
		
	}

}
