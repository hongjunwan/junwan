package lab2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	JPanel p1;
	private JButton[] btns;

	public MyFrame() {
		setSize(300, 200);
		setTitle("My Frame");

		btns = new JButton[10];

		p1 = new JPanel();
//	    p1.setLayout(new FlowLayout()); //lab2 1번째문제
		p1.setLayout(new GridLayout(0,4)); //lab2의 도전과제

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("Button" + i);
			p1.add(btns[i]);
		}

		add(p1);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
