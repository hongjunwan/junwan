package programming3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.scene.layout.Border;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JTextField textField;
	private JButton[] btns;

	public MyFrame() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		btns = new JButton[17];
		String a[] = {"c","7","8","9","/","4","5","6","*","1","2","3","-","0","+/-","=","+"};
		
		for(int x = 0; x < btns.length; x++) {
			btns[x] = new JButton(a[x]);
			btns[x].setHorizontalAlignment(JButton.LEFT);
		}
		
		panel = new JPanel();
		textField = new JTextField(25);
		
		panel.add(textField);
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(btns[0],BorderLayout.LINE_START);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 4));
		
		for(int x = 1; x < btns.length; x++) {
			panel2.add(btns[x]);
		}
		
		add(panel,BorderLayout.NORTH);
		add(panel1,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
		
	}
}
