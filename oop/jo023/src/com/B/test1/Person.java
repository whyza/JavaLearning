package com.B.test1;

public class Person {
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public void ShowData() {
		System.out.println("姓名："+getName()+"\t年龄："+getAge()+"\t性别："+getSex());
	}
}
