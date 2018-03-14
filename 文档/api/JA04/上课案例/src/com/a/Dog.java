package com.a;

public class Dog implements Comparable<Dog> {

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}

	public Dog(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		if (this.getAge() < d.getAge()) {
			return -1;
		} else if (this.getAge() == d.getAge()) {
			return 0;
		} else {
			return 1;
		}
	}
}
