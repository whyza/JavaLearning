package com.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class T {

	public static void main(String[] args) {
		// ����һ���˿���
		ArrayList<Card> list = new ArrayList<Card>();

		String[] arr = { "����", "����", "����", "÷��" };
		for (String hs : arr) {
			for (int i = 1; i <= 13; i++) {
				Card d = new Card(i, hs);
				list.add(d);
			}
		}

		Card dxw = new Card(14, "С��");
		list.add(dxw);

		list.add(new Card(15, "����"));

		// ������ŵ���
		Random r = new Random();
		// ���弯�����������ŵ���
		ArrayList<Card> listdp = new ArrayList<Card>();

		for (int i = 1; i <= 3; i++) {
			//�������ó�һ�ţ�������Ƽ���
			Card dt = list.remove(r.nextInt(list.size()));
			listdp.add(dt);
		}
		
		System.out.println("--�������ŵ�����");
		for (Card card : listdp) {
			System.out.println(card);
		}
		
		ArrayList<Card> listA = new ArrayList<Card>();
		ArrayList<Card> listB = new ArrayList<Card>();
		ArrayList<Card> listC = new ArrayList<Card>();
		
		for (int i = 1; i <= 17; i++) {
			listA.add(list.remove(r.nextInt(list.size())));
		}
		for (int i = 1; i <= 17; i++) {
			listB.add(list.remove(r.nextInt(list.size())));
		}
		for (int i = 1; i <= 17; i++) {
			listC.add(list.remove(r.nextInt(list.size())));
		}
	
		
		System.out.println("A������");
		//�˿�������
		Collections.sort(listA);
		for (Card card : listA) {
			System.out.println(card);
		}


	}

}
