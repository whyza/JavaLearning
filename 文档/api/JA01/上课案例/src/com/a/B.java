package com.a;

public class B {

	public static void main(String[] args) {
		
		//�ж�ĳ���ַ��ǲ�������
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('1'));
		//�ж��ǲ�����ĸ
		System.out.println(Character.isLetter('A'));;
		System.out.println(Character.isLetter(48));;
		
		//�ж��ǲ�����ĸ��������
		System.out.println(Character.isLetterOrDigit('!'));
		//�ж���ĸ�Ƿ�ΪСд���
		System.out.println(Character.isLowerCase('A'));
		
		System.out.println(Character.isUpperCase('A'));
		//�ж��ǲ��ǿո�
		System.out.println(Character.isSpaceChar(' '));
		
		System.out.println(Character.toLowerCase('C'));
		
		System.out.println(Character.toUpperCase('z'));
	}

}
