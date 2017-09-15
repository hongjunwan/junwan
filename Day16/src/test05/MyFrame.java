package test05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	private JPanel panel;
	private JButton btn;
	
	public MyFrame() {
		panel = new JPanel();
		btn = new JButton("누르세요.");
		
		btn.addActionListener(this);
		panel.add(btn);
		add(panel);
		
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렸다~!!!!");
	}
}
