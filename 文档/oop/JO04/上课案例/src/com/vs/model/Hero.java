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
		System.out.println(this.getName()+"�Դ����ǹ⻷����Ϲ��"+obj.getName()+this.getAttack()+"��Ѫ��"+obj.getName()+"��ʣ"+obj.getHp()+"��Ѫ");
		
		
	}
	public void ATTACK(GameModel[] obj) {
	
		
	}

	@Override
	public void SHOW() {
		System.out.println("���һ�����죬"+this.getName()+"�����ǳ�����");
	}

}
