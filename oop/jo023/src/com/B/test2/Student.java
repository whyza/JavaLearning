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
		System.out.println("����:"+getName()+"\t��ߣ�"+getHeight()+"\t�꼶��"+getGrade());
	}
}
