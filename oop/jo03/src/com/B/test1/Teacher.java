package com.B.test1;

public abstract class Teacher {
	public String name;
	public int age;
	public abstract void Teach();
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
	public Teacher(String name, int age) {
		setName(name);
		setAge(age);
	}
	public void Show() {
		System.out.println("ĞÕÃû£º"+getName()+"\tÄêÁä£º"+getAge());
	}
	
}
