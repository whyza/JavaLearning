package com.hw.d;

public class MyTime {
	private int h;
	private int m;
	/**
	 * ��ֵ
	 * @param h Сʱ
	 * @param m ����
	 * @param s ��
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
	 * Ϊ��ǰʱ��������
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
	//���Сʱ��
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
