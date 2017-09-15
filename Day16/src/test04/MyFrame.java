package test04;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private MyPanel panel;
	
	public MyFrame() {
		panel = new MyPanel();
		
		add(panel);
		
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
