package test04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JLabel lb;
	private JTextField textField;
	
	public MyFrame() {
		 panel = new JPanel();
		 lb = new JLabel("�ڵ��� ��ȣ�� �Է��ϼ���.");
		 textField = new JTextField(15);
		 
		 textField.setText("���� �Ұ�");
		 textField.setEditable(false);
		 
		 panel.add(lb);
		 panel.add(textField);
		 
		 add(panel);
		 setSize(500,300);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
	}
	
//	public static void main(String[] args) {
//		new MyFrame();
//	}
}
