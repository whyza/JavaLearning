package com.B.test3;

public class Bullen extends Weapen{
	private String type;
	public Bullen(double Power, double speed) {
		super(Power, speed);	
	}
	public void Attack(String name) {
		setType(name);
		System.out.println("����"+getType()+"\t�ٶȣ�"+getSpeed()+"\t��������"+getPower());
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
