package JA04A;

import java.util.ArrayList;
import java.util.Collections;

public class paixuAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("����",2);
		Dog d2 = new Dog("����",4);
		Dog d3 = new Dog("��2",3);
		ArrayList<Dog> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		for (Dog dog : list) {
			System.out.println(dog);
		}
		System.out.println("===================");
		Collections.sort(list);
		for (Dog dog : list) {
			System.out.println(dog);
		}
	}

}
