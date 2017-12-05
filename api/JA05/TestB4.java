package JA05;

import java.util.HashSet;
import java.util.Iterator;

public class TestB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("张三"));
		hs.add(new Student("李四"));
		hs.add(new Student("王五"));
		Iterator<Student> i  = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
