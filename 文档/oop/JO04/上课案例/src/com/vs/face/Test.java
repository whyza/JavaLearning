package com.vs.face;

import java.util.Random;
import java.util.Scanner;

import com.vs.model.GameModel;
import com.vs.model.Hero;
import com.vs.model.SLM;
import com.vs.model.TANK;

public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		
		
		Hero h=new Hero("����", 10000, 1000000, 50);
		//��������ת��
		GameModel s=new SLM("ʷ��ķA", 100, 100, 10);
		s=new TANK("98������", 1000, 1000, 10000000);
		
		h.SHOW();
		s.SHOW();
		
		while(true){
			System.out.println("1-����\t2-����\t3-����");
			int cmd=in.nextInt();
			if(cmd==1){
				//����������������װ���ӳɣ�
				h.ATTACK(s);
				s.ATTACK(h);
				if(h.ISDEATH() && s.ISDEATH()){
					System.out.println("ͬʱ�ҵ�&");
					break;
				}
				if(h.ISDEATH()){
					System.out.println("ʤ���˱��ҳ���");
					break;
				}
				if(s.ISDEATH()){
					System.out.println(h.getName()+"�ɹ�������"+s.getName());
					break;
				}
				
				
			}else if(cmd==2){
				
				
			}else if(cmd==3){
				
				
			}else{
				
				
			}
		}
	}

}
