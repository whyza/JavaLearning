package com.A.test9;

public class Addition {
	private int num1;
	private int num2;
	private long num3;
	private long num4;
	private double d1;
	private double d2;
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}


	private char c;
	private char c1;
	private String str1;
	private String str2;
	public long getNum3() {
		return num3;
	}
	public void setNum3(long num3) {
		this.num3 = num3;
	}
	public long getNum4() {
		return num4;
	}
	public void setNum4(long num4) {
		this.num4 = num4;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public char getC1() {
		return c1;
	}
	public void setC1(char c1) {
		this.c1 = c1;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void Add(int num1,int num2) {
		setNum1(num1);
		setNum2(num2);
		System.out.println(getNum1()+"+"+getNum2()+"="+(num1+num2));
	}
	public void Add(long num1,long num2) {
		setNum3(num1);
		setNum4(num2);
		System.out.println(getNum3()+"+"+getNum4()+"="+(num1+num2));
	}

	public void Add(char num1,char num2) {	
		setC(num1);
		setC1(num2);
		System.out.println(getC()+"+"+getC1()+"="+(num1+num2));
	}
	public void Add(double num1,double num2) {
		setD1(num1);
		setD2(num2);

		System.out.println(getD1()+"+"+getD2()+"="+(num1+num2));
	}


	public void Add(String num1,String num2) {
		setStr1(num1);
		setStr2(num2);
		System.out.println(getStr1()+"+"+getStr2()+"="+(num1+num2));
	}

}
