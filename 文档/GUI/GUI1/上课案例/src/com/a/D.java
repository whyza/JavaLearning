package com.a;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class D extends JFrame{
	
	public D(){
		setTitle("������");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		//���찴ť
		JButton jb=new JButton("С���");
		JButton jb1=new JButton("С����");
		JButton jb2=new JButton("С���1111");
		JButton jb3=new JButton("С����22222");
		//�õ������м���Բ��������򣬲������߿�ͱ�����
		Container c= getContentPane();
		
		
		JPanel jp=new JPanel(new FlowLayout());
		jp.add(jb);
		jp.add(jb1);
		
		
		JPanel jp2=new JPanel(new FlowLayout());
		jp2.add(jb2);
		jp2.add(jb3);
		
		c.setLayout(new GridLayout(2, 2));
	c.add(jp);
	c.add(jp2);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new D();
		//GUI���ַ�ʽ
	}

}
