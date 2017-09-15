package test01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton btn;
	private JPanel panel;
	
	public MyFrame() {
		btn = new JButton("눌러보세요 ~ !");
		panel = new JPanel();
		
		MyListener listener = new MyListener();
		btn.addActionListener(listener);
		
		panel.add(btn);
		
		add(panel);
		
		setTitle("이벤트 처리 예제 #1");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
