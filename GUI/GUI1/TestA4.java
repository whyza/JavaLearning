package GUI1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TestA4 extends JFrame{
	public TestA4() {
		JPanel jp1 = new JPanel(new FlowLayout());
		JLabel jl=new JLabel("ѧ��");
		JTextField jtp1 = new JTextField(10);
		JLabel jl1=new JLabel("����");
		JTextField jtp2 = new JTextField(10);
		
		JLabel jl2=new JLabel("�ձ�");
		JRadioButton jr1 = new JRadioButton("��");
		JRadioButton jr2 = new JRadioButton("Ů");
		jp1.add(jl);
		jp1.add(jtp1);
		jp1.add(jl1);
		jp1.add(jtp2);
		jp1.add(jl2);
		jp1.add(jr1);
		jp1.add(jr2);
		
		JPanel jp2 = new JPanel(new FlowLayout());
		JLabel jlb=new JLabel("����");
		JTextField jtf = new JTextField(10);
		JLabel jlb1=new JLabel("סַ");
		JTextField jtf2 = new JTextField(10);
		
		jp2.add(jlb);
		jp2.add(jtf);
		jp2.add(jlb1);
		jp2.add(jtf2);
		
		JPanel jp3 = new JPanel(new FlowLayout());
		
		JButton jb = new JButton("���");
		JButton jb2 = new JButton("ɾ��");
		JButton jb3 = new JButton("�޸�");
		JButton jb4 = new JButton("��ѯ");
		jp3.add(jb);
		jp3.add(jb2);
		jp3.add(jb3);
		jp3.add(jb4);
		
		JPanel jp4 = new JPanel(new FlowLayout());
		JTextArea jta = new JTextArea(200, 150); 
		jp4.add(jta);
		
		setLocationRelativeTo(null);
		setSize(600,400);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1));
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestA4();
	}

}
