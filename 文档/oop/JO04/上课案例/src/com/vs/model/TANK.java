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
		System.out.println(this.getName()+"����"+obj.getName()+"�����ũ��������"+this.getAttack()+"��Ѫ��"+obj.getName()+"��ʣ"+obj.getHp()+"��Ѫ");
		
	}

	@Override
	public void SHOW() {
	System.out.println("�����Ǹ����͵�̹��");
	}

}
