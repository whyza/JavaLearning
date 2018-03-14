package com.a;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E extends JFrame {

	private JButton jb1, jb2;
	private JLabel jl1, jl2;
	private JTextField jt;
	private int result = 0;

	public E() {
		Random r = new Random();
		result = r.nextInt(100);
		// 初始化本次游戏结果

		setSize(300, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane();
		c.setLayout(null);

		jb1 = new JButton("猜");
		
		jb1.addActionListener(new CaiLin());
		jb2 = new JButton("重来");

		jl1 = new JLabel("请输入你猜的数：");
		jl2 = new JLabel("------");

		jt = new JTextField();

		jl1.setBounds(30, 30, 70, 30);
		jt.setBounds(130, 30, 80, 30);

		jl2.setBounds(50, 70, 70, 30);

		jb1.setBounds(30, 130, 100, 30);
		jb2.setBounds(160, 130, 100, 30);

		c.add(jb1);
		c.add(jb2);
		c.add(jl1);
		c.add(jl2);
		c.add(jt);

		setVisible(true);

	}

	class CaiLin implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int cai = Integer.parseInt(jt.getText());
			if (cai > result) {
				jl2.setText("你猜大了");
			} else if (cai < result) {
				jl2.setText("你猜小了");
			} else {
				jl2.setText("你猜对了");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E();
	}

}
