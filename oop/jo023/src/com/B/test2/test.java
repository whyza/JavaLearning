package com.B.test2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("张三");
		s.setAge(20);
		s.setHeight(1.6);
		s.setGrade(15);
		s.SayHy();
		Teacher t = new Teacher();
		t.setName("李四");
		t.setAge(31);
		t.setHeight(1.7);
		t.setSalary(5000);
		t.SayHy();
	}

}
