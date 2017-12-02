package com.B.test2;

public class Teacher extends Person{
	private int Salary;

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	public void SayHy() {
		System.out.println("我是:"+getName()+"\t身高："+getHeight()+"\t薪水："+getSalary());
	}
}
