package com.a;

import java.util.ArrayList;
import java.util.Collections;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("1111");
		list.add("Xoao");
		list.add("王贤杰");
		list.add("罗金瑞");
		list.add("罗金荣");
		list.add("大数1");
		list.add("22大数");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string+"======="+(string.charAt(2)+0));
		}
	}

}
