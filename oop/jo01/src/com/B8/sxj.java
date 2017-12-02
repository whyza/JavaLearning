package com.B8;

public class sxj {
	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public double min(double a, double b, double c) {
		double min = a;
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else if (c < a && c < b) {
			min = c;
		}
		return min;
	}

	public int G(int a) {
		int g = a%10;
		return g;	
	}
	public int L(int a){
		return a*a*a;
	}
	public int H(int a){
		int H=0;
		for(int i=1;i<=a;i++){
			H+=i;			
		}
		return H;
		
	}
}

