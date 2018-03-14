package com.vs.model;

public abstract class GameModel {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int hp;
	private int maxhp;
	private int attack;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp>=0 && hp<=getMaxhp()){
			this.hp = hp;
		}else{
			this.hp=0;
		}
	}
	public int getMaxhp() {
		return maxhp;
	}
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public GameModel(String name, int hp, int maxhp, int attack) {
		setAttack(attack);
		setMaxhp(maxhp);
		//判断hp的时候使用了maxhp
		setHp(hp);
		setName(name);
	}
	
	
	
	public abstract void ATTACK(GameModel obj);
	
	
	
	public abstract void SHOW();
	
	/**
	 * 判断自己是否死亡
	 * @return 是否死亡
	 */
	public boolean ISDEATH(){
		if(this.getHp()<=0){
			return true;
		}else{
			return false;
		}
	}
		
	
	
}
