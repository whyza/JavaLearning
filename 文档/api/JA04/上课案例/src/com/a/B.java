package com.a;

import java.util.ArrayList;
import java.util.Collections;

public class B {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(1);
		list.add(-999);
		list.add(200);
		
		
		//�Ƴ������±�
	//	list.remove(1);
	
		Integer a=new Integer(1);
		list.remove(a);
		
		
		
		
		
		System.out.println(list.get(1));
		
		
		
		
		
//		
//		
//		
//		//����
//		Collections.sort(list);
//		
//		
//		//��������
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		list=(ArrayList<Integer>) list.subList(1, list.size()-1);
//	
	
	}

}
