package programming2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JButton btn;
	private JLabel lb;
	private JLabel lb1;
	private JTextField textField;

	public MyFrame() {
		setSize(300,200);
		setTitle("이자 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 0));

		panel = new JPanel();
		panel.setLayout(null);
		
		lb = new JLabel("원금을 입력하시오");
		textField = new JTextField(5);

		lb.setBounds(10, 2, 140, 30);
		textField.setBounds(200, 2, 60, 30);

		panel.add(lb);
		panel.add(textField);

		panel1 = new JPanel();
		panel1.setLayout(null);
		
		lb1 = new JLabel("이율을 입력하시오");
		textField = new JTextField(5);
		
		lb1.setBounds(10, 2, 140, 30);
		textField.setBounds(200, 2, 60, 30);

		panel1.add(lb1);
		panel1.add(textField);

		panel2 = new JPanel();
		btn = new JButton("변환");
		btn.setBackground(Color.orange);

		panel2.add(btn);

		panel3 = new JPanel();
		textField = new JTextField(15);
		textField.setText("이자는 연 75만원 입니다.");

		panel3.add(textField);

		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		
		setVisible(true);

	}
}
