package JA04B;

import java.util.ArrayList;
import java.util.Random;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("·½¿é");
		list1.add("ºìÌÒ");
		list1.add("ºÚÌÒ");
		list1.add("Ã·»¨");
		Random d = new Random();
		ArrayList<Puke> list2 = new ArrayList<>();
		while(true) {
			int dx = d.nextInt(13) + 1;
			int hs = d.nextInt(4);
			Puke p1 = new Puke(list1.get(hs), dx);
			list2.add(p1);
			if (list2.size() >= 13) {
				break;
			}
		}
//		for (int i = 0; i < list2.size(); i++) {
//			for (int j = i + 1; j < list2.size(); j++) {
//				// System.out.println(i+"\t"+j);
//				System.out.println(list2.get(i));
//				System.out.println(list2.get(j));
//				System.out.println("=================================================================");
//				if (list2.get(i).equals(list2.get(j))) {
//					System.out.println(list2.get(i));
//					System.out.println(list2.get(j));
//					list2.remove(i);
//					int hs = d.nextInt(1);
//					int dx = d.nextInt(13) +1;
//					Puke p1 = new Puke(list1.get(hs), dx);
//					list2.add(p1);
//				}
//			}
//		}

		for (Puke puke : list2) {
			System.out.println(puke);
		}
	}

}
