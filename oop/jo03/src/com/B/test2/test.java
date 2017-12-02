package com.B.test2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog() {};
//		a.Love();
		Animal[] animals = new Animal[3];
		for(int i = 0;i<animals.length;i++) {
			if(i==0) {
				a.Love();
			}
			if(i==1) {
				a = new Cat() {};
				a.Love();
			}
			if(i==2) {
				a = new Pig() {};
				a.Love();
			}
		}

	}

}
