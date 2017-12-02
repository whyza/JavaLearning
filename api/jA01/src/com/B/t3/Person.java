package com.B.t3;

public class Person {
	private String name;
	private int age;
	private float weight;
	private boolean JieHun;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public boolean isJieHun() {
		return JieHun;
	}
	public void setJieHun(boolean jieHun) {
		JieHun = jieHun;
	}
	
	public Person(String name,int age,float weight,boolean JieHun) {
		setName(name);
		setAge(age);
		setJieHun(JieHun);
		setWeight(weight);
	}
	public void Show() {
		System.out.print("姓名："+getName()+"\t年龄："+getAge()+"\t体重："+getWeight());
		String jh = "已经结婚";
		if(!isJieHun()) {
			jh = "未婚";
		}
		System.out.println(jh);
	}
	
}
