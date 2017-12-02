package com.B;

public class WuMingFen {
	private String theMa;
	private int quantity;
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
	private boolean likeSoup;
	public WuMingFen(String theMa,int quantity,boolean likeSoup) {
		if(likeSoup == true) {
			System.out.print("来碗"+quantity+"的"+theMa+"粉");
			System.out.println("需要汤");
		}else {
			System.out.print("来碗"+quantity+"的"+theMa+"粉");
			System.out.println("不需要汤");
		}
	}
	public WuMingFen(String theMa,int quantity) {
		System.out.println("重载方法被执行");
		System.out.println("来碗"+quantity+"的"+theMa+"粉");
		System.out.println("-------------");
	}
	public WuMingFen() {
		setTheMa("酸辣面码");
		setQuantity(2);
		setLikeSoup(true);
		System.out.println(theMa+"\t"+quantity+"两"+likeSoup);	
	}
	public void check(String theMa,int quanlity,boolean likeSoup) {
		if(quanlity > 0) {
			setQuantity(quanlity);
		}else {
			quanlity=1;
		}
		System.out.println(theMa+"\t"+quanlity+"\t"+likeSoup);
	}
	
}
