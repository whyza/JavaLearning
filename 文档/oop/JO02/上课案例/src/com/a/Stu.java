package com.a;

public class Stu {

	String name;
	private int age ;
	private	char sex;
	private double height;

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=3 &&age<=100){
		this.age = age;
		}else{
			this.age=3;
		}
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if(sex=='��' || sex=='Ů'){
			this.sex = sex;
		}else{
			this.sex='��';
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void Show(){
		
		System.out.println("���ӽ�"+name+",�ҽ���"+age+"�������ҵ��Ա���"+sex);
	}
}
