package com.hw;

import java.util.Scanner;

public class T {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("ƒ„œÎ∫Õ…∂£ø");
		int cmd=in.nextInt();
		try {
			Drink d=   Drink.getDrink(cmd);
			d.taste();
		} catch (DrinkNoFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
