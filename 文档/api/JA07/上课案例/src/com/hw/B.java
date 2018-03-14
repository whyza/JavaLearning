package com.hw;

import java.util.ArrayList;
import java.util.Random;

public class B {
//5.随机生成不重复的26个小写字母，生成26个后就停止生成。
	public static void main(String[] args) {
		
		
		ArrayList<Character> list=new ArrayList<Character>();
		Random r=new Random();
		
		while(true){
			//产生随机字母
			char temp=(char)(r.nextInt(26)+97);
			//判断是否包含
			if(list.contains(temp)){
				continue;
			}else{
				list.add(temp);	
			}
			if(list.size()==26){
				break;
			}
		}
		for (Character c : list) {
			System.out.print(c);
		}
	}

}
