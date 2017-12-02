package com.B.test2;

public class Student extends Person{
	private int Grade;

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}
	public void SayHy() {
		System.out.println("我是:"+getName()+"\t身高："+getHeight()+"\t年级："+getGrade());
	}
}
