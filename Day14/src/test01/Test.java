package test01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("GUI ù��° �ǽ�");
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		JButton btn = new JButton("��ư�Դϴ�.");
		frame.add(btn);
	}
}
