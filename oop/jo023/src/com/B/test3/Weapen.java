package com.B.test3;

public class Weapen {
	private double Power;
	private double speed;
	
	public double getPower() {
		return Power;
	}
	public void setPower(double power) {
		Power = power;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Weapen(double Power,double speed) {
		setPower(Power);
		setSpeed(speed);
	}
	
}
