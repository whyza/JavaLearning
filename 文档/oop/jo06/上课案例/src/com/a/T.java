package com.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("�������һ����");
			int a = in.nextInt();
			System.out.println("������ڶ�����");
			int b = in.nextInt();
			System.out.println(a + "/" + b + "=" + (a / b));
		} catch (ArithmeticException e) {// ץ������
			System.out.println("����Ϊ0 �Ĵ���");
		} catch (InputMismatchException e1) {
			System.out.println("���벻ƥ��");
		} catch(Exception e2){
			System.out.println("����δ֪����");
		} finally {
			//����������ն����ߵĴ����
		}

	}

}
