package com.B6;

public class car {
	String pp;
	double price;
	String color;
	public void ShowString(){
		System.out.println("品牌："+pp+"\t"+"价格："+price+"\t"+"颜色："+color+"\t");
	}
	public void ShowStart(String pp){
		System.out.println(pp+"品牌启动了");
	}
	public void ShowBuy(String pp,double price){
		System.out.println(pp+"品牌的汽车被以"+price+"的价格卖了");
	}
}
