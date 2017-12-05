package JA05;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hs = new HashMap<>();
		hs.put("张三", 89);
		hs.put("李四", 99);
		hs.put("王五", 79);
		hs.put("赵六", 60);
		Set<Entry<String, Integer>> s = hs.entrySet();
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry.getKey()+"====="+entry.getValue());
		}
//		hs.remove("张三");
		hs.put("张三", 88);
		System.out.println("=============================");
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry.getKey()+"====="+entry.getValue());
		}
//		hs.values();
		System.out.println(hs.keySet());
		System.out.println(hs.values());
	}

}
