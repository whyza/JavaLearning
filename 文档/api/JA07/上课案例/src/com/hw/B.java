package com.hw;

import java.util.ArrayList;
import java.util.Random;

public class B {
//5.������ɲ��ظ���26��Сд��ĸ������26�����ֹͣ���ɡ�
	public static void main(String[] args) {
		
		
		ArrayList<Character> list=new ArrayList<Character>();
		Random r=new Random();
		
		while(true){
			//���������ĸ
			char temp=(char)(r.nextInt(26)+97);
			//�ж��Ƿ����
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
