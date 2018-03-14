package com.hw;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A extends JFrame {

	public A() {
		setTitle("我的第一个窗体");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jptop=new JPanel(new FlowLayout());
		
		JTextField jt = new JTextField("                 ");
		
		jptop.add(jt);
		c.add(jt, BorderLayout.NORTH);

		// 面板
		JPanel jp = new JPanel(new GridLayout(5, 3));
		String[] arr={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};
		for (String string : arr) {
			JButton jb=new JButton(string);
			jp.add(jb);
		}
		
		
		
		
		c.add(jp, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
	}

}
