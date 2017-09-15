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
	
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		panel = new JPanel();
		panel1 = new JPanel();	
		panel2 = new JPanel();	
		
		lb = new JLabel("거리를 마일 단위로 입력하시오");
		textField = new JTextField(5);
		panel.add(lb);
		panel.add(textField);
		
		btn = new JButton("변환");
		panel1.add(btn);
		
		textField = new JTextField("1마일은 1.6킬로미터 입니다.");
		panel2.add(textField);
		
		add(panel,BorderLayout.NORTH);
		add(panel1,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}
