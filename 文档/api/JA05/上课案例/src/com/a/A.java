package com.a;

import java.util.HashSet;
import java.util.Iterator;

public class A {
//���򼯺�
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		set.add("������");
		set.add("��˧");
		set.add("л����");
		set.add("����111");
		set.add("����");
		set.add("����2222");
		
		//��������
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
