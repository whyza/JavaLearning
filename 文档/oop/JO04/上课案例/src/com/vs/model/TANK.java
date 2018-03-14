package com.vs.model;

public class TANK extends GameModel{

	public TANK(String name, int hp, int maxhp, int attack) {
		super(name, hp, maxhp, attack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ATTACK(GameModel obj) {
		int temphp=obj.getHp();
		temphp-=this.getAttack();
		obj.setHp(temphp);
		System.out.println(this.getName()+"对着"+obj.getName()+"发射加农蛋，掉了"+this.getAttack()+"滴血，"+obj.getName()+"还剩"+obj.getHp()+"滴血");
		
	}

	@Override
	public void SHOW() {
	System.out.println("老子是个威猛的坦克");
	}

}
