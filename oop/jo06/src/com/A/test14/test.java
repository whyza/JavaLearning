package com.A.test14;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v=new Vehicles();
		v.run();
		v.showInfo("奔驰", "白色");
		Car c = new Car();
		c.run();
		c.ShowCar("大众", "黑色", 6);
		Truck t = new Truck();
		t.showTruck("----", "蓝色", (float) 1.2);
	}

}
