package com.A.test11;

public class Car {
	private int ltGeShu;
	private String color;
	private int weight;
	private double height;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getLtGeShu() {
		return ltGeShu;
	}
	public void setLtGeShu(int ltGeShu) {
		this.ltGeShu = ltGeShu;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void addSpeed(int addSpeed) {
		setSpeed(addSpeed+getSpeed());
		System.out.println("正在加速----");
	}
	public void subSpeed(int subSpeed) {
		setSpeed(getSpeed()-subSpeed);
		System.out.println("正在减速----");
	}
	public void TingChe() {
		System.out.println("正在停车----");
	}
}
