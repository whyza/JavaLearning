package com.A.test20;

public abstract class Door2 implements Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	public abstract void theftproof();
	public abstract void waterproof();
	public abstract void bulletproof();
}
