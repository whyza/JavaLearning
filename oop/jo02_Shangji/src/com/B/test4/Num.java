package com.B.test4;

public class Num {
	public Num(int num1,int num2) {
		if(num1 > num2) {
			System.out.println("max="+num1);
		}else {
			System.out.println("max="+num2);
		}
	}
	public Num(double num1,double num2,double num3) {
		System.out.println("�˻�Ϊ��"+num1*num2*num3);
	}
	public Num(String str1,String str2) {
		if(str1.equals(str2)) {
			System.out.println("�ַ���ֵ���");
		}else {
			System.out.println("�ַ���ֵ����");
		}
	}
}
