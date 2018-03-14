package com.a;

public class B {

	public static void main(String[] args) {
		
		//判断某个字符是不是数字
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isDigit('1'));
		//判断是不是字母
		System.out.println(Character.isLetter('A'));;
		System.out.println(Character.isLetter(48));;
		
		//判断是不是字母或者数字
		System.out.println(Character.isLetterOrDigit('!'));
		//判断字母是否为小写情况
		System.out.println(Character.isLowerCase('A'));
		
		System.out.println(Character.isUpperCase('A'));
		//判断是不是空格
		System.out.println(Character.isSpaceChar(' '));
		
		System.out.println(Character.toLowerCase('C'));
		
		System.out.println(Character.toUpperCase('z'));
	}

}
