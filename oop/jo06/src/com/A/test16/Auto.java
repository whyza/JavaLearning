package com.A.test16;

public class Auto {
	private int ltGs;
	private String color;
	private double height;
	private int speed;
	public int getLtGs() {
		return ltGs;
	}
	public void setLtGs(int ltGs) {
		this.ltGs = ltGs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void addspeed(int addspeed) {
		setSpeed(getSpeed()+addspeed);
		System.out.println("正在加速");
	}
	public void subspeed(int subspeed) {
		setSpeed(getSpeed()+subspeed);
		System.out.println("正在减速");
	}
	public void TingChe() {
		System.out.println("正在停车-----");
	}
	
}
