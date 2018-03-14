package com.a;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G extends JFrame {
	JButton jb;
	private int x=10,y=10;
	public G() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container c = getContentPane();

	
		c.setLayout(null);
		jb=new JButton("");
	
		jb.setBackground(Color.PINK);
		jb.setBounds(x, y, 30, 30);
		
		c.add(jb);
		
		
		jb.addMouseListener(new MoLin());

		c.addMouseMotionListener(new MouMLin());
		setVisible(true);

	}
	
	class MoLin implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("mouseClicked");
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			jb.setBackground(Color.BLUE);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			jb.setBackground(Color.PINK);
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("mousePressed");
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("mouseReleased");
		}
		
		
	}
	
	class MouMLin implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent arg0) {
			System.out.println("mouseDragged");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x=e.getX();
			y=e.getY();
			jb.setBounds(x, y, 30, 30);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new G();
	}

}
