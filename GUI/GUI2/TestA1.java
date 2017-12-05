package GUI2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestA1 extends JFrame{
	JTextField jt;
	JLabel jl;
	int rr = 0;
	public TestA1() {
		Random r = new Random();
		rr = r.nextInt(1001);
		setTitle("��������Ϸ");
		setLocationRelativeTo(null);
		setSize(500, 300);
		jt = new JTextField();
		
		
		JButton jb1 = new JButton("��");
		JButton jb2 = new JButton("��������");
		JButton jb3 = new JButton("�˳���Ϸ");
		JPanel jp  = new JPanel();
		jl = new JLabel("������һ��1000���ڵ�����");
		Container c = getContentPane();
		c.setLayout(null);
		jt.setBounds(0, 10,500,50 );
		jl.setBounds(0, 100, 400, 50);
		jb1.setBounds(10, 185, 150, 50);
		jb1.addActionListener(new CaiLin());
		jb2.setBounds(165, 185, 150, 50);
		jb2.addActionListener(new reset());
		jb3.setBounds(320, 185, 150, 50);
		jb3.addActionListener(new reTurn());
		c.add(jt);
		c.add(jl);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	class CaiLin implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int s = Integer.parseInt(jt.getText());
			if(s > rr) {
				jl.setText("̫����");
			}else if(s < rr){
				jl.setText("̫С��");
			}else{
				jl.setText("��ϲ�¶���");
			}
		}

	}

	class reset implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jt.setText("");
			jl.setText("������һ��1000���ڵ�����");
		}
		
	}
	class reTurn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//			return;
			setVisible(false);
		}
		
	}
	
	
	public static void main(String[] args) {
		new TestA1();
	}
}
