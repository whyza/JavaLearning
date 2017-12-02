package com.test2;

public class tDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.name="旺财";
		d.sex='公';
		d.ShowData();
		Dog d1 = new Dog();
		d1.name="旺财2";
		d1.sex='母';
		d.Love(d1);
		d.YaoRen("女人");
		d.YaoRen("男人");
		d.YaoRen("妖");
	}

}
