package com.B.test3;

public class Tank extends Weapen{
	public Tank(double Power, double speed) {
		super(Power, speed);
	}
	private char dir;

	public char getDir() {
		return dir;
	}
	public void setDir(char dir) {
		this.dir = dir;
	}
	public void Attack(char dir) {
		setDir(dir);
		System.out.println("����̹��"+"\t��"+getDir()+"�����˶�"+"\t��������"+getPower());
	}
}
