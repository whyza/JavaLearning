package com.A.test4;

public class Number {
	private int n1;
	private int n2;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public void addtion() {
		System.out.println(n1+"+"+n2+"="+(n1+n2));
	}
	public void subtrantion() {
		System.out.println(n1+"-"+n2+"="+(n1-n2));
		
	}
	public void multioliction() {
		System.out.println(n1+"*"+n2+"="+(n1*n2));
		
	}
	public void division() {
		System.out.println(n1+"/"+n2+"="+(n1/n2));
		
	}
		
}
