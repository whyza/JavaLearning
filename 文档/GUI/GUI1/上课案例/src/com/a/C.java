package com.a;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C extends JFrame {

	public C() {
		setTitle("������");
		setSize(100, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �õ�����Բ��������
		Container c = getContentPane();
		// �����Ĭ�ϵĲ��ֵķ�ʽ����һ���ؼ�ȫ��մ�����ҵ�סԭ����

		// ��ʽ����
		//FlowLayout bj = new FlowLayout();
		// �߽粼��
		//BorderLayout bj=new BorderLayout();
		//���񲼾�
		GridLayout bj=new GridLayout(3, 3);
		c.setLayout(bj);

		JButton jb1 = new JButton("AAA");
		JButton jb2 = new JButton("BBB");
		JButton jb3 = new JButton("CCCCAAA");
		JButton jb4 = new JButton("DDDDDDDDD");
		JButton jb5 = new JButton("����");
		
		for (int i = 9; i >=1; i--) {
			JButton jb=new JButton(i+"");
			c.add(jb);
		}
		/*
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		*/
//		c.add(jb1,BorderLayout.NORTH);
//		c.add(jb2,BorderLayout.WEST);
//		c.add(jb3,BorderLayout.SOUTH);
//		c.add(jb4,BorderLayout.EAST);
//		c.add(jb5, BorderLayout.CENTER);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}
