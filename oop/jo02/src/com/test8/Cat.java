package com.test8;

public class Cat {
	private String name;
	private int age;
	private char sex;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void ShowData() {
		System.out.println("名字："+name+"年龄:"+age+"性别："+sex+"品种："+type);

	}
}
