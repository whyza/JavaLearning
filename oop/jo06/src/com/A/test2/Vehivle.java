package com.A.test2;

public class Vehivle {
	private int speed;
	private int size;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void move() {
		System.out.println("正在移动-----");
	}
	public void speedUp() {
		System.out.println("正在加速-----");
	}
	public void speedDown() {
		System.out.println("正在减速-----");
	}

	public Vehivle(int speed, int size) {
		setSpeed(speed);
		setSize(size);
		System.out.println("速度："+getSpeed()+"\t体积："+getSize());
	}
	
}
