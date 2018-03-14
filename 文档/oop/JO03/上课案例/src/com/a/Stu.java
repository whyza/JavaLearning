package com.a;

public class Stu extends Person{

	private int stuno;
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	
	public Stu(String name,int age,char sex,int no){
		//显式的调用父类构造方法
		super(name, age, sex);
		setStuno(no);
	}

	
}
