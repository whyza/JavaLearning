package com.a;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B extends JFrame{
	
	public B(){
		setTitle("������");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		//���찴ť
		JButton jb=new JButton("С���");
		JButton jb1=new JButton("С����");
		//�õ������м���Բ��������򣬲������߿�ͱ�����
		Container c= getContentPane();
		
		c.add(jb);
		c.add(jb1);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new B();
		//GUI���ַ�ʽ
	}

}
