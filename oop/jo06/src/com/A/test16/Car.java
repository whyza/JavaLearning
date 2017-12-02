package com.A.test16;

public class Car extends Auto {
	private String Kongtiao;
	private String CD;
	public String getKongtiao() {
		return Kongtiao;
	}
	public void setKongtiao(String kongtiao) {
		Kongtiao = kongtiao;
	}
	public String getCD() {
		return CD;
	}
	public void setCD(String cD) {
		CD = cD;
	}
	public void addspeed(int addspeed) {
		setSpeed(getSpeed()+addspeed);
		System.out.println("正在加速======");
	}
	public void subspeed(int subspeed) {
		setSpeed(getSpeed()+subspeed);
		System.out.println("正在减速=====");
	}
}
