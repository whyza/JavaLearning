package com.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		//1.�������100��Сд��ĸ��ͬʱͳ��ÿ����ĸ�����˶��ٸ�
		//a=97   z=122
		Random r=new Random();
		//System.out.println((char)122);
		
		ArrayList<Character> list=new ArrayList<Character>(100);
		
		//����100�������ĸ
		for (int i = 1; i <= 100; i++) {
			int temp=r.nextInt(26)+97;
			list.add((char)temp);
		}
		//a c d a����
		//ͳ�Ƴ��ִ���
		//��������ֵ���������桾���ֵ���ĸ��=key�͡���ĸ�Ĵ�����=value
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		//����100�������ĸ
		for (Character c : list) {
//			��ǰ����ֵ������û�а�������ĸ�ļ�(����ĸ�״γ���)
			if(!map.containsKey(c)){
				//�½�����ĸ��key�����ڵĴ�����1��
				map.put(c,1);
			}else{
				//�����ҵ��˸���ĸ�ĳ��ִ������ó���+1.�Ż�ȥ
				map.put(c, map.get(c)+1);
			}
		}
		
		 Set<Character> set=	map.keySet();
		 for (Character c : set) {
			System.out.println(c+"====="+map.get(c));
		}
		
		
	}

}
