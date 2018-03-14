package com.hw.b;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

public class WuMingFen {

	private String ma;
	private int q;
	private boolean tang;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	public boolean isTang() {
		return tang;
	}
	public void setTang(boolean tang) {
		this.tang = tang;
	}
	public WuMingFen(String ma, int q, boolean tang) {
		setMa(ma);
		setQ(q);
		setTang(tang);
	}
	public WuMingFen(String ma, int q) {
		setMa(ma);
		setQ(q);
	}
	
	
	public WuMingFen() {
		//酸辣面码、2两、带汤的
		setMa("酸辣面码");
		setQ(2);
		setTang(true);
	}
	
	
	public void check(){
		String tang="不带汤";
		if(isTang()){
			tang="带汤";
		}
		System.out.println("我是一碗"+tang+"的"+getMa()+"的"+getQ()+"两的粉");
	}
	
	
	
	
}
