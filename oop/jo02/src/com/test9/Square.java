package com.test9;

public class Square {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if(side > 0 ) {
			this.side=side;
		}else {
			this.side=1;
		}
	}
	public Square() {
		
	}
	public Square(int side) {
		setSide(side);
	}
	public int GetMianJi() {
		return getSide()*getSide();
	}
	public int GetZhouChang() {
		return getSide()*4;
	}
}
