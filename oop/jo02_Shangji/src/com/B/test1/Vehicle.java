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
		System.out.println("�����ƶ�-----");
	}
	public void speedUp() {
		this.speed+=10;
		System.out.println("���ڼ���----"+"�ٶȣ�"+speed);
	}
	public void speedDown() {
		this.speed-=10;
		System.out.println("���ڼ���----"+"�ٶȣ�"+speed);
	}
	public void ShowData() {
		System.out.println("�ٶȣ�"+getSpeed()+"\t�����"+getSize());
	}
}
