package com.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class T {

	public static void main(String[] args) {
		// 创建一副扑克牌
		ArrayList<Card> list = new ArrayList<Card>();

		String[] arr = { "红桃", "黑桃", "方块", "梅花" };
		for (String hs : arr) {
			for (int i = 1; i <= 13; i++) {
				Card d = new Card(i, hs);
				list.add(d);
			}
		}

		Card dxw = new Card(14, "小王");
		list.add(dxw);

		list.add(new Card(15, "大王"));

		// 抽出三张底牌
		Random r = new Random();
		// 定义集合来保存三张底牌
		ArrayList<Card> listdp = new ArrayList<Card>();

		for (int i = 1; i <= 3; i++) {
			//盒子里拿出一张，放入底牌集合
			Card dt = list.remove(r.nextInt(list.size()));
			listdp.add(dt);
		}
		
		System.out.println("--本轮三张底牌是");
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
	
		
		System.out.println("A家牌面");
		//扑克牌排序
		Collections.sort(listA);
		for (Card card : listA) {
			System.out.println(card);
		}


	}

}
