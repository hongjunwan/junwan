package test01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton btn;
	private JPanel panel;
	
	public MyFrame() {
		btn = new JButton("���������� ~ !");
		panel = new JPanel();
		
		MyListener listener = new MyListener();
		btn.addActionListener(listener);
		
		panel.add(btn);
		
		add(panel);
		
		setTitle("�̺�Ʈ ó�� ���� #1");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
