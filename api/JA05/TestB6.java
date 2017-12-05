package JA05;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestB6 {
	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("张三", 90);
		hs.put("李四", 88);
		Set<Entry<String, Integer>> s = hs.entrySet();
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry);
		}
		hs.replace("张三", 99);
		System.out.println("=======");
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry);
		}
	}
}
