package com.B;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������һ���ַ���");
			String str = sc.next();	
			char[] arr  = str.toCharArray();
			try {
				for (int i = 0; i < arr.length; i++) {
					int num = (int)arr[i];
					System.out.println(num+100);
				}
				
				
//				System.out.println(str+100);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�޷�ת�������Σ�����������");
			}

			
		}

		
	}

}
