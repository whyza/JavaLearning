package JA05;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestB3 {
	public static void main(String[] args) {
		
		HashMap<Integer, Cat> hs = new HashMap<Integer, Cat>();
		Cat c = new Cat("Íú²Æ1",2);
		Cat c1 = new Cat("Íú²Æ2",1);
		Cat c2 = new Cat("Íú²Æ3",3);
		hs.put(1, c);
		hs.put(2, c1);
		hs.put(3, c2);
//		c.Cry();
		Set<Entry<Integer, Cat>> s = hs.entrySet();
		for (Entry<Integer, Cat> entry : s) {
			entry.getValue().Cry();
			System.out.println(entry);
		}
	}
}
