package mileTransducer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel lb;
	private JTextField textField;
	private JTextField resultText;
	private JButton transBtn;

	public MyFrame() {
		lb = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		textField = new JTextField(5);
		resultText = new JTextField(15);
		transBtn = new JButton("��ȯ");
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		MyListener listener = new MyListener();
		transBtn.addActionListener(listener);
			
		panel.add(lb);
		panel.add(textField);
		panel1.add(transBtn);
		panel2.add(resultText);

		add(panel, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		pack();
		setTitle("���� ��ȯ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int mile = Integer.parseInt(textField.getText());
			resultText.setText(textField.getText() + "mile�� " + (1.609344*mile) + "km�Դϴ�." );
		}
	}
}
