package com.A.test14;

public class Vehicles {
	private String brand;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void run() {
		System.out.println("���Ѿ�������");
	}
	public void showInfo(String brand,String color) {
		setBrand(brand);
		setColor(color);
		System.out.println("�̱�"+getBrand()+"\t��ɫ��"+getColor());
	}
}
