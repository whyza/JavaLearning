package com.a;

import java.util.ArrayList;
import java.util.Collections;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("1111");
		list.add("Xoao");
		list.add("���ͽ�");
		list.add("�޽���");
		list.add("�޽���");
		list.add("����1");
		list.add("22����");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string+"======="+(string.charAt(2)+0));
		}
	}

}
