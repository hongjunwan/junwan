package lab1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		panel.setBackground(Color.yellow);
		panelA.setBackground(Color.RED);
		panelB.setBackground(Color.BLUE);
		
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label);
		
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
}

