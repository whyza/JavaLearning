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
		System.out.println(this.getName()+"����"+obj.getName()+"���˿�ˮ������"+this.getAttack()+"��Ѫ��"+obj.getName()+"��ʣ"+obj.getHp()+"��Ѫ");
		
	}

	@Override
	public void SHOW() {
		// TODO Auto-generated method stub
		System.out.println("������һֻ�ɰ���ʷ��ķ");
	}

}
