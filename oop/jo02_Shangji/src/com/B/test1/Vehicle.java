package com.B.test1;

public class Vehicle {
	public int speed;
	public double size;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public void move() {
		System.out.println("正在移动-----");
	}
	public void speedUp() {
		this.speed+=10;
		System.out.println("正在加速----"+"速度："+speed);
	}
	public void speedDown() {
		this.speed-=10;
		System.out.println("正在减速----"+"速度："+speed);
	}
	public void ShowData() {
		System.out.println("速度："+getSpeed()+"\t体积："+getSize());
	}
}
