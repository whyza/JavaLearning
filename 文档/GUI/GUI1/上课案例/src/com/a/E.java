package com.a;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class E extends JFrame{
	
	public E(){
		setTitle("王贤杰小电影登录页面");
		setSize(360, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//创造按钮
		JButton jb=new JButton("登录");
		JLabel jl=new JLabel("用户名");
		JLabel jl1=new JLabel("密码");
		
		JTextField jt=new JTextField();
		JPasswordField jt1=new JPasswordField();
//		JTextField jt1=new JTextField();
		//得到界面中间可以操作的区域，不包括边框和标题栏
		Container c= getContentPane();
		c.setLayout(null);
		
		jl.setBounds(50, 50, 50, 30);
		jl1.setBounds(50, 100, 50, 30);
	
		
		
		jt.setBounds(130, 50, 150, 30);
		jt1.setBounds(130, 100, 150, 30);
		
		jb.setBounds(130, 160, 100, 30);
		
		c.add(jl);
		c.add(jl1);
		c.add(jt);
		c.add(jt1);
		
		c.add(jb);
		setVisible(true);
	}

	public static void main(String[] args) {
		new E();
		//GUI布局方式
	}

}
