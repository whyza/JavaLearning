package com.vs.model;

public class SLM extends GameModel{

	public SLM(String name, int hp, int maxhp, int attack) {
		super(name, hp, maxhp, attack);
		
	}

	@Override
	public void ATTACK(GameModel obj) {
		int temphp=obj.getHp();
		temphp-=this.getAttack();
		obj.setHp(temphp);
		System.out.println(this.getName()+"朝着"+obj.getName()+"吐了口水，掉了"+this.getAttack()+"滴血，"+obj.getName()+"还剩"+obj.getHp()+"滴血");
		
	}

	@Override
	public void SHOW() {
		// TODO Auto-generated method stub
		System.out.println("老子是一只可爱的史莱姆");
	}

}
