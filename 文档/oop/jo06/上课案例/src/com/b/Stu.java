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
	 * ѧ�������������2�굽100��
	 * @param age
	 * @throws Exception 
	 */
	public void setAge(int age) throws StuAgeException {
		if(age>=2 && age<=100){
			this.age = age;
		}else{
			//�������
			throw (new StuAgeException()) ;
		}
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) throws StuSexException {
		if(sex=='��' || sex=='Ů'){
			this.sex = sex;
		}else{
			//�ӳ�һ��StuSexException
			throw(new StuSexException());
		}
	}

}
