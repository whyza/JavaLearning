package JA04A;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(131);
		list.add(1);
		System.out.println("����ǰ--------");
		for (Integer i : list) {
			System.out.println(i);
		}
		Collections.sort(list);
		System.out.println("�����--------");
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
