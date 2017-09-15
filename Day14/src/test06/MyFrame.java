package test06;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton[] btns;
	private JPanel panelBtns;
	
	public MyFrame() {
		btns = new JButton[5];
		panelBtns = new JPanel();
		
		panelBtns.setLayout(new BorderLayout());
		
		for(int i = 0; i<btns.length; i++) {
			btns[i] = new JButton("��ư"+i);
		}	
			panelBtns.add(btns[0] ,BorderLayout.PAGE_START);
			panelBtns.add(btns[1] ,BorderLayout.LINE_START);
			panelBtns.add(btns[2] ,BorderLayout.LINE_END);
			panelBtns.add(btns[3] ,BorderLayout.CENTER);
			panelBtns.add(btns[4] ,BorderLayout.PAGE_END);
		
			
			add(panelBtns);
			setSize(400, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
