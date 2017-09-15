package intrestCalculate;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton transBtn;
	private JLabel principalLb;
	private JLabel interestLb;
	private JTextField principalText;
	private JTextField interestText;
	private JTextField resultText;

	public MyFrame() {
		setLayout(new GridLayout(4, 0));

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		principalLb = new JLabel("원금을 입력하시오");
		interestLb = new JLabel("이율을 입력하시오");
		principalText = new JTextField(5);
		interestText = new JTextField(5);
		transBtn = new JButton("변환");
		resultText = new JTextField(15);

		panel.setLayout(null);
		principalLb.setBounds(10, 2, 140, 30);
		principalText.setBounds(200, 2, 60, 30);

		panel1.setLayout(null);
		interestLb.setBounds(10, 2, 140, 30);
		interestText.setBounds(200, 2, 60, 30);

		MyListener listener = new MyListener();
		transBtn.addActionListener(listener);
		transBtn.setBackground(Color.orange);

		panel.add(principalLb);
		panel.add(principalText);
		panel1.add(interestLb);
		panel1.add(interestText);
		panel2.add(transBtn);
		panel3.add(resultText);

		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);

		setSize(300, 200);
		setTitle("이자 계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int principal = Integer.parseInt(principalText.getText());
			double interest = Double.parseDouble(interestText.getText());
			resultText.setText("이자는 연" + principal * (interest / 100) + "만원 입니다.");
		}
	}
}
