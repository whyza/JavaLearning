package com.A.test2;

public class Animal {
	public String name;
	public char sex;
	public Animal(){
		
	}
	public Animal(String name,char sex) {
		setName(name);
		setSex(sex);
	}
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
}
