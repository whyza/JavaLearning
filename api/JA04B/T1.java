package JA04B;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("John Alex");
		list.add("Miller Scott");
		list.add("John Anna");
		list.add("Johnson Jack");
		list.add("Hunter Jeff");
		list.add("Williams Serena");
		list.add("Williams Uenus");
		System.out.println("********************************");
		System.out.println("����LinkedList�еĶ���");
		System.out.println("********************************");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("������Ҫ���ҵ�����--");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("********************************");
		System.out.println("����ָ�������LinkedList����("+name+")��ͷ");
		System.out.println("********************************");
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).startsWith(name)) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("********************************");
		System.out.println("�������Ԫ��");
		System.out.println("********************************");
		System.out.println("ְԱ�б�֮ǰ��");
		for (String string : list) {
			System.out.print("["+string+"],");
		}
		System.out.println();
		LinkedList<String> list2  = new LinkedList<>();
		list2.add("John Alex");
		list2.add("Miller Scott");
		list2.add("John Anna");
		list2.add("Johnson Jack");
		list2.add("Hunter Jeff");
		list2.add("Williams Serena");
		list2.add("Williams Uenus");
		LinkedList<String> list3  = new LinkedList<>();
		Random r = new Random();
//		System.out.println(list2.size());
		while(true) {
			int rr = r.nextInt(list2.size());
			list3.add(list2.get(rr));
			list2.remove(rr);
			if(list2.size()==0) {
				break;
			}
		}
		System.out.println("ְԱ�б�֮��");
		for (String string : list3) {
			System.out.print("["+string+"],");
		}
		
		

	}

}
