package com.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// ����ֵ����key-value

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// ����Ԫ��
		map.put(101, "������");
		map.put(222, "����");
		map.put(333, "����");
		map.put(4, "Сǿ");
		map.put(5, "Сǿ");
		// ����null��û�иü�
		System.out.println(map.get(41));

		// Ԫ�ظ���
		System.out.println(map.size());
		// ����Сǿ
		System.out.println(map.remove(44));
		System.out.println(map.size());

		// map.clear();
		System.out.println(map.containsKey(111));
		System.out.println(map.containsValue("Сǿ"));

		System.out.println(map.replace(4, "44444"));
		System.out.println(map.get(4));

		map.put(4, "55555");

		System.out.println(map.get(4));

		// ���ϵı���

		Set<Integer> set = map.keySet();
		for (Integer i : set) {
			System.out.println(i + "=====" + map.get(i));
		}

		Collection<String> c = map.values();
		for (String string : c) {
			System.out.println(string);
		}

		Set<Entry<Integer, String>> ss = map.entrySet();

		for (Entry<Integer, String> e : ss) {
			System.out.println(e.getKey() + "====" + e.getValue());
		}

	}

}
