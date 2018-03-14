package com.hw.model;

public abstract class An {

	private String name;
	private double tz;
	private double maxtz;
	private double add;
	
	
	public abstract void ShowTZ();
	
	
	public An(String name, double tz, double maxtz, double add) {
		super();
		this.name = name;
		this.tz = tz;
		this.maxtz = maxtz;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTz() {
		return tz;
	}
	public void setTz(double tz) {
		this.tz = tz;
	}
	public double getMaxtz() {
		return maxtz;
	}
	public void setMaxtz(double maxtz) {
		this.maxtz = maxtz;
	}
	public double getAdd() {
		return add;
	}
	public void setAdd(double add) {
		this.add = add;
	}
	
	
}
