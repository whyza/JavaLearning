package com.A.test4;

public class Employee extends Role{

	public Employee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public Employee(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("play方法覆盖");
		
	}
	public Double salary;
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	static int ID;
	public final void sing() {
		System.out.println("sing方法");
	}
	
}
