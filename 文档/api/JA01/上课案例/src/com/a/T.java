package com.a;

import java.util.Random;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;//定义的是变量-仅有保存数据的功能，
		Integer b=new Integer(1);
		//-把包装数据类型转换为基本数据类型
		int c=	b.intValue();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//类型转字符串
		System.out.println(b.toString());
		int d=Integer.parseInt("123");
		System.out.println(d+1);
	}

}
