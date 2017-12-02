package com.A.test5;

public class Person {
	private String name;
	private int age;
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
	public Person(String name,int age) {
		setName(name);
		setAge(age);
	}
	public void display() {
		System.out.println("ĞÕÃû£º"+getName()+"\tÄêÁä£º"+getAge());
	}
}
