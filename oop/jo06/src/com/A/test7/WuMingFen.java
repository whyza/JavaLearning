package com.A.test7;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	public WuMingFen(String theMa,int quantity,boolean likeSoup) {
		setTheMa(theMa);
		setQuantity(quantity);
		setLikeSoup(likeSoup);
		check();
	}
	public WuMingFen(String theMa,int quantity){
		setTheMa(theMa);
		setQuantity(quantity);
//		check();
		System.out.println(getTheMa()+"\t"+getQuantity()+"两");
	}
	public WuMingFen() {
		setTheMa("酸辣面码");
		setQuantity(2);
		setLikeSoup(true);
		check();
	}
	public void check() {
		String tang = "不带汤";
		if(isLikeSoup()) {
			tang = "带汤";
		}
		System.out.println(getTheMa()+"\t"+getQuantity()+"两\t"+tang);
	}
}
