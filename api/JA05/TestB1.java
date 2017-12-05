package JA05;

import java.util.HashMap;

public class TestB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "张三");
		hs.put(2, "李四");
		hs.put(3, "王五");
		hs.put(4, "赵六");
		System.out.println(hs.keySet());
		System.out.println(hs.values());
	}


}
