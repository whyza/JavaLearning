package com.a;

import java.util.Calendar;

import javax.swing.JFrame;

public class A extends JFrame{
	
	public A(){
		
		this.setSize(300, 300);//��λ-����px
		//���ñ���
		this.setTitle("������һ������");
		//��������ʱ����Ļ�м�
		this.setLocationRelativeTo(null);
		//����Ĭ�ϵĹر�ģʽ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new A();
	}

}
