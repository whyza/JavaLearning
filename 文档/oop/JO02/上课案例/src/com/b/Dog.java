package com.b;

public class Dog {
	private String name;
	private int age;
	private char sex;
	private String type;

	public Dog(String s, int a, char sex, String t) {
		setAge(a);
		setName(s);
		setSex(sex);
		setType(t);
		System.out.println("����һֻ������");
	}

	public Dog() {
	}

	public Dog(String name) {

		setName(name);
	}

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
		if (age >= 1 && age <= 30) {
			this.age = age;
		} else {
			this.age = 1;
		}
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == '��' || sex == 'ĸ') {
			this.sex = sex;
		} else {
			this.sex = 'ĸ';
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void Jiao() {
		System.out.println("��������");

	}

}
