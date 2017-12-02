package com.B6;

public class jo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.pp="大众";
		c.price=120000;
		c.color="黑色";
		car c1 = new car();
		c1.pp="奔驰";
		c1.price=220000;
		c1.color="黑色";
		c.ShowBuy(c.pp, c.price);
		c.ShowString();
		c.ShowStart(c.pp);
		c1.ShowBuy(c1.pp, c1.price);
		c1.ShowString();
		c1.ShowStart(c1.pp);
	}

}
