package com.B;

public class fen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WuMingFen fen = new WuMingFen("ţ��", 3, true);
		System.out.println("-------------------------");
		WuMingFen fen2 = new WuMingFen("ţ��", 3);
		WuMingFen fen3 = new WuMingFen();
		WuMingFen fen4 = new WuMingFen();
		fen4.check("ţ��", 10, true);
		fen4.check("ţ��", -1, true);	
	}
}
		