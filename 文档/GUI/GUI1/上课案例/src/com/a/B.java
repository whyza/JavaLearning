package com.a;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B extends JFrame{
	
	public B(){
		setTitle("标题栏");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		//创造按钮
		JButton jb=new JButton("小姐姐");
		JButton jb1=new JButton("小妹妹");
		//得到界面中间可以操作的区域，不包括边框和标题栏
		Container c= getContentPane();
		
		c.add(jb);
		c.add(jb1);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new B();
		//GUI布局方式
	}

}
