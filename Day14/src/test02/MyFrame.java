package test02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn;
	
	public MyFrame() {
		System.out.println("JFrame ��ӹ޾Ƽ� MyFrame �����ϱ�");
		
		setLayout(new FlowLayout());
		
		btn = new JButton("��Ʈ����");
		add(btn); 
		
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
}
