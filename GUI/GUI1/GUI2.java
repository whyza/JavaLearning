package GUI1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI2 extends JFrame{
	public GUI2() {
		Container c = getContentPane();
		BorderLayout br = new BorderLayout();
		setLayout(br);
		JButton jb1 = new JButton("东");
		JButton jb2 = new JButton("南");
		JButton jb3 = new JButton("西");
		JButton jb4 = new JButton("北");
		setSize(400, 200);
//		c.add(jb1,BorderLayout.NORTH);
//		c.add(jb2,BorderLayout.WEST);
//		c.add(jb3,BorderLayout.SOUTH);
//		c.add(jb4,BorderLayout.EAST);
		GridLayout bj=new GridLayout(4, 3);
		setLayout(bj);
		for (int i = 12; i >=1; i--) {
			JButton jb=new JButton(i+"");
			c.add(jb);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI2();
	}

}
