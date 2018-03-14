package com.a;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B extends JFrame implements ActionListener {
	
	JButton jb ;
	public B() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		jb= new JButton("点我");
		
		jb.addActionListener(this);
		
		

		c.add(jb);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		jb.setText("老子被点了。");
	}

}
