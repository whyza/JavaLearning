package com.b;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s=new Stu();
		
		s.name="����";
		s.age=80;
		s.sex='��';
		
		Stu s1=new Stu();
		s1.name="������";
		s1.age=100;
		s1.sex='��';
		
		s1.FD();
		s.FD();
		
		s.YSHF(1000);
		s1.YSHF(90000);
		
		String res=s.NKD();
		System.out.println(res);
		
		System.out.println(s1.MY(1001));
		
		System.out.println(s.Love(s1));
	}

}
