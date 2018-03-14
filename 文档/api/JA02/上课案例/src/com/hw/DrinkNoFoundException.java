package com.hw;

public class DrinkNoFoundException extends Exception {

	public DrinkNoFoundException(){
		super("系统暂没有该种饮料");
	}

}
