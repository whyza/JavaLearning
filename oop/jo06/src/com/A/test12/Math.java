package com.A.test12;

public class Math {
	public  Math(int num1,int num2) {
		if(num1 == num2) {
			System.out.println("���");
		}else if (num1 > num2) {
			System.out.println("Max="+num1);
		}else{
			System.out.println("Max="+num2);
		}
	}
	public Math(double num1,double num2,double num3) {
		System.out.println("��Ϊ��"+num1*num2*num3);
	}
	public Math(String str1,String str2) {
		if(str1.equals(str2)) {
			System.out.println("�ַ���ֵ���");
		}else {
			System.out.println("�ַ���ֵ����");
		}
	}
}
