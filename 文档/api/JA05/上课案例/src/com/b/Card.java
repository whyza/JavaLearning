package com.b;

import java.util.HashMap;

public class Card implements Comparable<Card> {
	private int ds;// 1~13..С��14 ����15��
	private String hs;

	public Card(int ds, String hs) {
		super();
		this.ds = ds;
		this.hs = hs;
	}

	public int getDs() {
//		if(ds==1){
//			return 14;
//		}else if(ds==2){
//			return 15;
//		}
//		else if(ds==14){
//			return 16;
//		}
//		else if(ds==15){
//			return 17;
//		}
		
		return ds;
	}

	public void setDs(int ds) {
		this.ds = ds;
	}

	public String getHs() {
		return hs;
	}

	public void setHs(String hs) {
		this.hs = hs;
	}

	// ��õ�ǰ�˿��ĵ� ���ܣ�������==getCard();
	@Override
	public String toString() {
		switch (getDs()) {
		case 15:
			return "����";
		case 14:
			return "С��";
		case 13:
			return getHs() + "K";
		case 12:
			return getHs() + "Q";
		case 11:
			return getHs() + "J";
		case 1:
			return getHs() + "A";
		default:
			return getHs() + getDs();
		}
	}

	@Override
	public int compareTo(Card d) {
		if (this.getDs() > d.getDs()) {
			return 1;
		} else if (this.getDs() < d.getDs()) {
			return -1;
		} else {
			return 0;
			// ������ͬ��ʱ�򣬺��ҡ����ҡ�÷������Ƭ
//			if(this.getHs().equals("С��")|| this.getHs().equals("����")){
//				return 0;
//			}
//				HashMap<String, Integer> map = new HashMap<String, Integer>();
//				map.put("����", 4);
//				map.put("����", 3);
//				map.put("÷��", 2);
//				map.put("��Ƭ", 1);
//				if (map.get(this.getHs()) > map.get(d.getHs())) {
//					return 1;
//				} else if (map.get(this.getHs()) < map.get(d.getHs())) {
//					return -1;
//				} else {
//					return 0;
//				}
			} 
		}
	}
