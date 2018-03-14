package com.b;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class Stu {
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	/**
	 * 学生合理的年龄是2岁到100岁
	 * @param age
	 * @throws Exception 
	 */
	public void setAge(int age) throws StuAgeException {
		if(age>=2 && age<=100){
			this.age = age;
		}else{
			//创造错误
			throw (new StuAgeException()) ;
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) throws StuSexException {
		if(sex=='男' || sex=='女'){
			this.sex = sex;
		}else{
			//扔出一个StuSexException
			throw(new StuSexException());
		}
	}

}
