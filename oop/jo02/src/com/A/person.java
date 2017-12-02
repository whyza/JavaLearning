package com.A;

public class person {
	private String name;
	private int age;
	public person(String name,int age) {
		System.out.println("构造方法被调用---------");
		System.out.println("姓名："+name+"\t年龄："+age);
	}
	public person() {
		
	}
	
	public void display(String name,int age) {
		System.out.println("------------------------");
		System.out.println("姓名："+name+"年龄："+age);
	}

	
	
}
