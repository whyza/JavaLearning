package com.a;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A extends JFrame{
	public A(){
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	Container c=	getContentPane();
	
	c.setLayout(new FlowLayout());
	
	JButton jb=new JButton("点我");
	//得到监听器对象
	Lin l=new Lin();
	//在按钮上加了这个监听器
	jb.addActionListener(l);
	
	
	
	
	
	c.add(jb);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new A();
	}

}
