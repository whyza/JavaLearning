package com.A.test14;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v=new Vehicles();
		v.run();
		v.showInfo("����", "��ɫ");
		Car c = new Car();
		c.run();
		c.ShowCar("����", "��ɫ", 6);
		Truck t = new Truck();
		t.showTruck("----", "��ɫ", (float) 1.2);
	}

}
