package JA05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class TestA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
//		97-122

		int zm = 0;
//		System.out.println(zm);
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			zm =  r.nextInt(26)+97;		
			char z2 = (char)zm;
			list.add(z2);
		}
		for (Character character : list) {
			System.out.println(character);
		}
//		System.out.println(list.size());
		//保存字母和出现的次数
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int times = 0;
		for (int i = 0; i < list.size(); i++) {
        	if(map.containsKey(list.get(i))) {
        		times = map.get(list.get(i))+1;
        		map.put(list.get(i), times);     		
        	}else {
        		map.put(list.get(i), 1);
        	}
        }
		
        Set<Entry<Character, Integer>> ss = map.entrySet();
        for (Entry<Character, Integer> entry : ss) {
			System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }
	}
}
