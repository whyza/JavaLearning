package com.B.test1;

public class Car extends Auto{
	public String KongTiao;
	public String CD;
	public void AddSpeed() {
		System.out.println("正在加速---覆盖");
	}
	public void SubSpeed() {
		System.out.println("正在减速---覆盖");
	}
}
