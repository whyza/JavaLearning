package com.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C {

	//���ϵı���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("xoao");
		list.add("Сè");
		list.add("С��");
		list.add("С��");
		list.add("С��");
		
		Collections.sort(list);
		//���ϱ����ķ�ʽ
		//1-�±�ʽ����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//2-������ѭ��
		System.out.println("=====������ѭ��=========");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//3-��ǿ��forѭ��-foreach
		System.out.println("=====��ǿ��forѭ��-foreach=========");
		for (String ss : list) {
			System.out.println(ss);
		}
		
	}

}
