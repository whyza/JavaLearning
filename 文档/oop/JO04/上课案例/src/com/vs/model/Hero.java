package com.vs.model;

public class Hero  extends GameModel{

	public Hero(String name, int hp, int maxhp, int attack) {
		super(name, hp, maxhp, attack);
	}

	@Override
	public void ATTACK(GameModel obj) {
		int temphp=obj.getHp();
		temphp-=this.getAttack();
		obj.setHp(temphp);
		System.out.println(this.getName()+"自带主角光环，闪瞎了"+obj.getName()+this.getAttack()+"滴血，"+obj.getName()+"还剩"+obj.getHp()+"滴血");
		
		
	}
	public void ATTACK(GameModel[] obj) {
	
		
	}

	@Override
	public void SHOW() {
		System.out.println("天空一声巨响，"+this.getName()+"闪亮登场……");
	}

}
