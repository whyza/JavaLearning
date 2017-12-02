package com.A.test14;

public class Car extends Vehicles{
	private int seats;

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void ShowCar(String brand,String color,int seats) {
		setBrand(brand);
		setColor(color);
		setSeats(seats);
		System.out.println("商标+"+getBrand()+"\t颜色："+getColor()+"\t座位数量："+getSeats());
	}
}
