package com.A.test2;

public class Dog extends Animal{
	private String weiBa;

	public String getWeiBa() {
		return weiBa;
	}

	public void setWeiBa(String weiBa) {
		this.weiBa = weiBa;
	}
	
	public Dog(String name,char sex,String weiBa) {
		super(name,sex);
		setWeiBa(weiBa);
	}	
	public void ToString() {
		System.out.println("我是："+getName()+"我是:"+getSex()+"的"+"我有："+getWeiBa());
	}

}
