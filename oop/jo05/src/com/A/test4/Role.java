package com.A.test4;

public abstract class Role {
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
	public abstract void play();
	public Role(String name) {
		System.out.println("���֣�"+name);
	}
	public Role(int age) {
		System.out.println("���䣺"+age);
	}
}
