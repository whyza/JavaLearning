package JA05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestB2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		for (String string : list) {
			System.out.println(string);
		}
		Collections.sort(list);
		System.out.println("=======");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("=======");
		Iterator<String> s = list.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
	}

}
