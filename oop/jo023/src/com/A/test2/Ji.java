package com.A.test2;

public class Ji extends Animal{
	private String chiBang;

	public String getChiBang() {
		return chiBang;
	}

	public void setChiBang(String chiBang) {
		this.chiBang = chiBang;
	}
	public Ji(String name,char sex,String chiBang) {
		super(name,sex);
		setChiBang(chiBang);
	}
	public void ToString() {
		System.out.println("���ǣ�"+getName()+"����"+getSex()+"��"+"���У�"+getChiBang());
	}
}
