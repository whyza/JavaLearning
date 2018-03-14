package com.a;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class D extends JFrame{
	
	public D(){
		setTitle("标题栏");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		//创造按钮
		JButton jb=new JButton("小姐姐");
		JButton jb1=new JButton("小妹妹");
		JButton jb2=new JButton("小姐姐1111");
		JButton jb3=new JButton("小妹妹22222");
		//得到界面中间可以操作的区域，不包括边框和标题栏
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
		//GUI布局方式
	}

}
