package com.hw;

public abstract class Drink {

	public final static int COFFEE=1;
	public final static int BEER=2;
	public final static int MILK=3;
	public abstract void taste();

	
	public static Drink getDrink(int type) throws DrinkNoFoundException{
		Drink d=null;
		switch (type) {
			case COFFEE:
				d=new COFFEE();
				break;
			case MILK:
				d=new MILK();
				break;
			case BEER:
				d=new BEER();
				break;
			default:
				throw (new DrinkNoFoundException());
				
		}
		return d;
		
	}
}
