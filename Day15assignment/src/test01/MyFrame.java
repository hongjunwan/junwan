package test01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JPanel panel;
	
	public MyFrame() {
		
		btn1 = new JButton("RED");
		btn2 = new JButton("BLUE");	
		panel = new JPanel();
			
		MyListener listener = new MyListener();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				panel.setBackground(Color.RED);
//			}
//		});
//		
//		btn2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				panel.setBackground(Color.BLUE);
//			}
//		});
		
		panel.add(btn1);
		panel.add(btn2);
		
		add(panel);
		
		setTitle("색상 변환");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Object obj = e.getSource();
			Color r = new Color(255,000,000);
			Color b = new Color(000, 051, 204);
			
			if(btn1==obj) {
				panel.setBackground(r);
			}
			else {
				panel.setBackground(b);
			}
		}
	}
}
