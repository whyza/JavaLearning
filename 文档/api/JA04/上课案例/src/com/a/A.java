package com.a;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty());
		// 1-��Ԫ��
		list.add("������");
		list.add(Math.PI);
		list.add('A');
		// 2-ȡԪ��

		System.out.println(list.get(0));
		// �жϼ����Ƿ�Ϊ��

		System.out.println(list.isEmpty());
		// ��ռ���Ԫ��
		// list.clear();
		// ���ϱ�����
		Object[] arr = list.toArray();

		System.out.println(list.indexOf(Math.PI + 1));

		// ��ȡ����ĳ����-��ͷ����β
		// size===��ȡ������Ԫ�صĸ���
		System.out.println(list.subList(1, 2).size());
		
		// �滻ָ��λ�õ�Ԫ��
		list.set(0, "������");
		System.out.println(list.get(0));
		// ͨ��Ԫ�����Ƴ��������Ƿ��Ƴ��ɹ�
		System.out.println(list.remove("AA"));
	
		System.out.println(list.remove(99));
		System.out.println(list.get(0));
	}

}
