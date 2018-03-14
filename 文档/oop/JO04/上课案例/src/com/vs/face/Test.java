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
		
		
		Hero h=new Hero("孙运", 10000, 1000000, 50);
		//不用引用转型
		GameModel s=new SLM("史莱姆A", 100, 100, 10);
		s=new TANK("98自行炮", 1000, 1000, 10000000);
		
		h.SHOW();
		s.SHOW();
		
		while(true){
			System.out.println("1-攻击\t2-技能\t3-道具");
			int cmd=in.nextInt();
			if(cmd==1){
				//产生攻击力（算上装备加成）
				h.ATTACK(s);
				s.ATTACK(h);
				if(h.ISDEATH() && s.ISDEATH()){
					System.out.println("同时挂掉&");
					break;
				}
				if(h.ISDEATH()){
					System.out.println("胜败乃兵家常事");
					break;
				}
				if(s.ISDEATH()){
					System.out.println(h.getName()+"成功消灭了"+s.getName());
					break;
				}
				
				
			}else if(cmd==2){
				
				
			}else if(cmd==3){
				
				
			}else{
				
				
			}
		}
	}

}
