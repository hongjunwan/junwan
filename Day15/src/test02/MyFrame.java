package test02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
	
	class MyListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("���ȴ�!!");
//			btn.setText("���Ƚ��ϴ�.");
			Random random = new Random();
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
			
			
			Color c = new Color(r,g,b);
			
			panel.setBackground(c);
		}
	}
}
