package com.A.test2;

public abstract class Door2 implements Door{

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("���ڿ���");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("���ڹ���");
	}
	
	public abstract void theftproof();
	public abstract void waterproof();
	public abstract void bulletproof();

}
