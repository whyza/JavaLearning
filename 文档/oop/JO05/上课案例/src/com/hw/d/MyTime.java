package com.hw.d;

public class MyTime {
	private int h;
	private int m;
	/**
	 * 赋值
	 * @param h 小时
	 * @param m 分钟
	 * @param s 秒
	 */
	public MyTime(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}
	private int s;
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	/**
	 * 为当前时间增加秒
	 * @param s
	 */
	public void ADDS(int s){
		this.s+=s;
		//
		int h=this.s/3600;
		this.ADDH(h);
		
		s=s%3600;
		//
		
		int m=s/60;
		this.ADDM(m);
		
		s=s%60;
		setS(s);
		
		
		
	}
	public void SUBS(int s){
		this.s-=s;
		
	}
	//添加小时的
	public void ADDH(int h){
		this.h+=h;
		this.h%=24;
		
	}
	
	public void ADDM(int m){
		this.m=this.m+m;
		int h=this.m/60;
		this.ADDH(h);
		
		setM(h%60);
	}

}
