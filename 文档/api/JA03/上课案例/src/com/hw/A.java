package com.hw;

import java.util.Scanner;

/*
 * 3����һ������Ϊ6�������������
1��	��ʾ����һ������Ϊ6����������
2��	�����ṩ��������м���
3��	���ܹ�������:
��ԭʼ����Ϊ:123456---��������Ϊ:178906
��ԭʼ����Ϊ:492845����������Ϊ:447395
4��	����ӡԭʼ����ͼ�������

 */
public class A {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������λ������");
		String password=in.next();
		StringBuffer sb=new StringBuffer();
		String res="";
		//׷�ӵ�һ��
		res+=password.charAt(0);
	//	sb.append(password.charAt(0));
		//1-4
		for (int i = 1; i <= 4; i++) {
			int temp=Integer.parseInt(password.charAt(i)+"");
			temp=(temp+5)%10;
			res+=temp;
		}
		//׷�����һ��
		res+=password.charAt(password.length()-1);
		
		System.out.println(res);
		

	}

}
