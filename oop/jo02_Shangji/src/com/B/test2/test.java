package com.B.test2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime();
		time.setHour(10);
		time.setMinute(41);
		time.setSecond(12);		
		time.diapliy();
		time.addHour(50);
		time.addMinute(331);  
		time.addSecond(2818);  //47 fen 10 miao 
//		time.subHour(88);
//		time.subHour(69);
		time.subMinute(3000);
	}
}
