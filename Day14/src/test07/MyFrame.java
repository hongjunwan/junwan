package test07;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton[] btns;
	private JPanel panelBtns;

	public MyFrame() {
		btns = new JButton[5];
		panelBtns = new JPanel();
		
		panelBtns.setBackground(Color.YELLOW);
		panelBtns.setLayout(new GridLayout(0,3));

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("¹öÆ°" + i);
			panelBtns.add(btns[i]);
		}

		add(panelBtns);
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
