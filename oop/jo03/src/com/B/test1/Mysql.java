package com.B.test1;

public abstract class Mysql extends Teacher {

	public Mysql(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("我是数据库老师，负责教Mysql");
	}

}
