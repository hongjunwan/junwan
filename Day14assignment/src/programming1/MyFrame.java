package programming1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
	private JButton btn;
	
	public MyFrame() {
	
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel1 = new JPanel();	
		panel2 = new JPanel();	
		
		lb = new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�");
		textField = new JTextField(5);
		panel.add(lb);
		panel.add(textField);
		
		btn = new JButton("��ȯ");
		panel1.add(btn);
		
		textField = new JTextField("1������ 1.6ų�ι��� �Դϴ�.");
		panel2.add(textField);
		
		add(panel,BorderLayout.NORTH);
		add(panel1,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}
