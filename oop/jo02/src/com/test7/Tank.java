package com.test7;

public class Tank {
	private int x;
	private int y;
	private char dir;
	private String type;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getDir() {
		return dir;
	}
	public void setDir(char dir) {
		this.dir = dir;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Tank() {
	}
	public void ShowData() {
		System.out.println("横坐标："+x+"纵坐标:"+y+"方向："+dir+"品牌："+type);

	}
}
