package JA04A;

import java.util.LinkedList;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Íú²Æ",2);
		Dog d2 = new Dog("À´¸£",2);
		Dog d3 = new Dog("aa",3);
		LinkedList<Dog> link =  new LinkedList<>();
		link.add(d1);
		link.add(d2);
		link.add(d3);
		for (Dog dog : link) {
			System.out.println(dog);
		}
	}

}
