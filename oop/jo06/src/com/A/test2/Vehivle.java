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
		System.out.println("�����ƶ�-----");
	}
	public void speedUp() {
		System.out.println("���ڼ���-----");
	}
	public void speedDown() {
		System.out.println("���ڼ���-----");
	}

	public Vehivle(int speed, int size) {
		setSpeed(speed);
		setSize(size);
		System.out.println("�ٶȣ�"+getSpeed()+"\t�����"+getSize());
	}
	
}
