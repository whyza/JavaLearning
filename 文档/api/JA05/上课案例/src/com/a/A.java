package com.a;

import java.util.HashSet;
import java.util.Iterator;

public class A {
//无序集合
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		set.add("王文明");
		set.add("刘帅");
		set.add("谢凯文");
		set.add("大树111");
		set.add("大树");
		set.add("大树2222");
		
		//遍历集合
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("--------------");
		 Iterator<String> it=set.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 
		
	}

}
