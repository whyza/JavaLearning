package com.a;

public class Teacher extends Person{
	private int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public Teacher(String name,int age ,char sex,int no)
	{
		super(name, age, sex);
		setNo(no);
		
	}
	
	

}
