package com.A.test14;

public class Truck extends Vehicles {
	private float load;

	public float getLoad() {
		return load;
	}

	public void setLoad(float load) {
		this.load = load;
	}
	public void showTruck(String brand,String color,float laod) {
		setBrand(brand);
		setColor(color);
		setLoad(laod);
		System.out.println("�̱�+"+getBrand()+"\t��ɫ��"+getColor()+"\t���أ�"+getLoad());
		
	}
}
