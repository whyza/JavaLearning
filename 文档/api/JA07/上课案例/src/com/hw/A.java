package com.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		//1.随机生成100个小写字母，同时统计每个字母生成了多少个
		//a=97   z=122
		Random r=new Random();
		//System.out.println((char)122);
		
		ArrayList<Character> list=new ArrayList<Character>(100);
		
		//放入100个随机字母
		for (int i = 1; i <= 100; i++) {
			int temp=r.nextInt(26)+97;
			list.add((char)temp);
		}
		//a c d a……
		//统计出现次数
		//创建键对值集合来保存【出现的字母】=key和【字母的次数】=value
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		//遍历100个随机字母
		for (Character c : list) {
//			当前键对值集合中没有包含该字母的键(该字母首次出现)
			if(!map.containsKey(c)){
				//新建该字母的key，对于的次数是1次
				map.put(c,1);
			}else{
				//里面找到了该字母的出现次数，拿出来+1.放回去
				map.put(c, map.get(c)+1);
			}
		}
		
		 Set<Character> set=	map.keySet();
		 for (Character c : set) {
			System.out.println(c+"====="+map.get(c));
		}
		
		
	}

}
