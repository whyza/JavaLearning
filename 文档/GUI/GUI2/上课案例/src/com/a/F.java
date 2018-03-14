package com.a;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class F extends JFrame {
	private JButton jb;
	private int x=10,y=10;
	public F() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Container c=getContentPane();
		
		c.addKeyListener(new KeyLin());
		//键盘事件---输入焦点
		c.setFocusable(true);
		
		c.setLayout(null);
		jb=new JButton("");
	
		jb.setBackground(Color.PINK);
		jb.setBounds(x, y, 30, 30);
		
		c.add(jb);
		
		

		setVisible(true);
	}
	
	
	class KeyLin implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_D:
				x+=10;
				break;
			case KeyEvent.VK_S:
				y+=10;
				break;
			case KeyEvent.VK_A:
				x-=10;
				break;
			case KeyEvent.VK_W:
				y-=10;
				break;

			default:
				break;
			}
			
			
			jb.setBounds(x, y, 30, 30);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F();
	}

}
