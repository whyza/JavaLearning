package GUI1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TestA1 extends JFrame{

	public TestA1 () {
		setSize(400, 200);
		Container c = getContentPane();
		JButton jb1 = new JButton("°´Å¥1");
		JTextField jt1 = new JTextField(10);
		JLabel jtb1 = new JLabel("HelloWorld");
		  JRadioButton randioButton1=new JRadioButton("Java");  
	        JRadioButton randioButton2=new JRadioButton("PHP",true);  
	        JRadioButton randioButton3=new JRadioButton("C++"); 
		FlowLayout bj = new FlowLayout();
		setLayout(bj);
		c.add(jb1);
		c.add(jt1);
		c.add(jtb1);
		c.add(randioButton1);
		c.add(randioButton2);
		c.add(randioButton3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestA1();
	}

}
