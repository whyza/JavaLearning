package com.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C {

	//集合的遍历
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("xoao");
		list.add("小猫");
		list.add("小猪");
		list.add("小鸡");
		list.add("小羊");
		
		Collections.sort(list);
		//集合遍历的方式
		//1-下标式遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//2-迭代器循环
		System.out.println("=====迭代器循环=========");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//3-增强型for循环-foreach
		System.out.println("=====增强型for循环-foreach=========");
		for (String ss : list) {
			System.out.println(ss);
		}
		
	}

}
