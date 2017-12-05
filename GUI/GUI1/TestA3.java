package GUI1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestA3 extends JFrame{

	public TestA3() {
		setLocationRelativeTo(null);
		Container c=getContentPane();		
		JTextField jt1 = new JTextField(10);
		setSize(600, 350);
		JPanel jp=new JPanel(new BorderLayout());
		jp.add(jt1,BorderLayout.NORTH);
		
		
		
		JPanel jp2=new JPanel(new GridLayout(5,3));	
		for (int i = 0; i <= 9; i++) {
			JButton jb = new JButton(""+i);
			jp2.add(jb);
		}
		jp.add(jp2,BorderLayout.CENTER);
		JButton jb1 = new JButton("+");
		JButton jb2 = new JButton("-");
		JButton jb3 = new JButton("*");
		JButton jb4 = new JButton("/");
		JButton jb5 = new JButton("=");
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		c.setLayout(new GridLayout());
		c.add(jp);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestA3();
	}

}
