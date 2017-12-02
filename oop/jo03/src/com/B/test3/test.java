package com.B.test3;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit a  = new Apple() {
		};
		Fruit[] fruits = new Fruit[3];
		for(int i = 0;i<fruits.length;i++) {
			if(i==0) {
				a.Eat();
			}
			if(i==1) {
				a = new Banana() {
				};
				a.Eat();
			}
			if(i==2) {
				a = new Orange() {
				};
				a.Eat();
			}
		}
	}

}
