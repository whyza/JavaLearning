package com.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// 键对值集合key-value

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 放入元素
		map.put(101, "王文明");
		map.put(222, "狗蛋");
		map.put(333, "旺财");
		map.put(4, "小强");
		map.put(5, "小强");
		// 返回null。没有该键
		System.out.println(map.get(41));

		// 元素个数
		System.out.println(map.size());
		// 返回小强
		System.out.println(map.remove(44));
		System.out.println(map.size());

		// map.clear();
		System.out.println(map.containsKey(111));
		System.out.println(map.containsValue("小强"));

		System.out.println(map.replace(4, "44444"));
		System.out.println(map.get(4));

		map.put(4, "55555");

		System.out.println(map.get(4));

		// 集合的遍历

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
