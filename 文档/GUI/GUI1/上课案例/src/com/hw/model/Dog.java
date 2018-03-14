package com.hw.model;

public class Dog extends An {

	public Dog(String name, double tz, double maxtz, double add) {
		super(name, tz, maxtz, add);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowTZ() {
		System.out.println("我是一只可爱的狗，我爱咬人");
	}

}
