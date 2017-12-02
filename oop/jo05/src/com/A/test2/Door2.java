package com.A.test2;

public abstract class Door2 implements Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("正在开门");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("正在关门");
	}
	
	public abstract void theftproof();
	public abstract void waterproof();
	public abstract void bulletproof();

}
