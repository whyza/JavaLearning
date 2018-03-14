package com.a;

public class Person {
	
	
	public Person(String name,int age,char sex){
		setName(name);
		setAge(age);
		setSex(sex);
	}
	
	private String name;
	private char sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show(){
		System.out.println("我叫"+getName()+",我的年龄是"+getAge()+",我的性别是"+getSex());
	}
	
}
