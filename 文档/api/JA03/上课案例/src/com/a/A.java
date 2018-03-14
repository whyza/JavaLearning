package com.a;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
//		in.next();
//		in.nextInt();
//		in.nextDouble();
		System.out.println("请输入你的零花钱");
		System.out.println("1111111111111111");
		if(in.hasNextDouble()==true){
			System.out.println("2222222222222222");
			double m=in.nextDouble();
			System.out.println("3333333333333333333");
			System.out.println("您本月的零花钱是"+m);
		}else{
			System.out.println("输入错误");
			
		}
		System.out.println("444444444444444");
		
		
		
		
	}

}
