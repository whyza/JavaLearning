package com.B.test1;

public abstract class Net extends Teacher {

	public Net(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("我是.Net老师，负责教.Net");
	}

}
