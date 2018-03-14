package com.b;

public class T {

	public static void main(String[] args) {
		Stu s = new Stu();
		try {
			s.setAge(1);
			s.setSex('1');
		} catch (StuAgeException e) {
			e.printStackTrace();
		} catch (StuSexException e) {
			e.printStackTrace();
		}
			
		
	}

}
