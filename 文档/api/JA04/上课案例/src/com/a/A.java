package com.a;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty());
		// 1-放元素
		list.add("王文明");
		list.add(Math.PI);
		list.add('A');
		// 2-取元素

		System.out.println(list.get(0));
		// 判断集合是否为空

		System.out.println(list.isEmpty());
		// 清空集合元素
		// list.clear();
		// 集合变数组
		Object[] arr = list.toArray();

		System.out.println(list.indexOf(Math.PI + 1));

		// 截取集合某部分-包头不包尾
		// size===获取集合内元素的个数
		System.out.println(list.subList(1, 2).size());
		
		// 替换指定位置的元素
		list.set(0, "郭重阳");
		System.out.println(list.get(0));
		// 通过元素来移除，返回是否移除成功
		System.out.println(list.remove("AA"));
	
		System.out.println(list.remove(99));
		System.out.println(list.get(0));
	}

}
