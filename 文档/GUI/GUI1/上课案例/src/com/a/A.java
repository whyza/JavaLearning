package com.a;

import java.util.Calendar;

import javax.swing.JFrame;

public class A extends JFrame{
	
	public A(){
		
		this.setSize(300, 300);//单位-像素px
		//设置标题
		this.setTitle("老子是一个窗口");
		//设置启动时在屏幕中间
		this.setLocationRelativeTo(null);
		//设置默认的关闭模式
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new A();
	}

}
