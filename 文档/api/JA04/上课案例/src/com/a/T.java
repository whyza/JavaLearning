package com.a;

import java.util.ArrayList;
import java.util.Collections;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog(12, "����");
		Dog d2 = new Dog(11, "����");
		Dog d3 = new Dog(13, "�в�");
		Dog d4 = new Dog(99, "Сǿ");
		
		ArrayList<Dog> list=new ArrayList<Dog>();
		list.add(d1);
		list.add(d3);
		list.add(d2);
		list.add(d4);
		
		Collections.sort(list);
		
		for (Dog dog : list) {
			System.out.println(dog);
		}
	}

}
