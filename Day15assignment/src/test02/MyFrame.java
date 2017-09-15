package test02;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton btn1;
	private JButton btn2;
	private JLabel lb;
	private JPanel panel1;
	private JPanel panel2;
	int count = 0;
	
	public MyFrame() {
		setLayout(new BorderLayout());
		
		lb = new JLabel("0");
		btn1 = new JButton("COUNT");
		btn2 = new JButton("RESET");
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		lb.setFont(new Font("Serif", Font.BOLD, 150));
		
		MyListener listener = new MyListener(); 
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);	
		
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				lb.setText(String.valueOf(++count));
//			}
//		});
//		
//		btn2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				lb.setText(String.valueOf(0));
//				count = 0;
//			}
//		});

		panel1.add(lb);
		panel2.add(btn1);
		panel2.add(btn2);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		
		setTitle("д╚©Нем");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			
			if(btn1 == obj) {
				lb.setText(String.valueOf(++count));
			}
			else {
				lb.setText(String.valueOf(0));
				count = 0;
			}
		}
	}
}
