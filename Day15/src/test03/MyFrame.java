package test03;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btn;
	private JPanel panel;
//	private ActionListener listener = new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// System.out.println("눌렸다!!");
//			// btn.setText("눌렸습니다.");
//			Random random = new Random();
//			int r = random.nextInt(256);
//			int g = random.nextInt(256);
//			int b = random.nextInt(256);
//
//			Color c = new Color(r, g, b);
//
//			panel.setBackground(c);
//		}
//	};

	public MyFrame() {
		btn = new JButton("눌러보세요 ~ !");
		panel = new JPanel();

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("눌렸다!!");
				// btn.setText("눌렸습니다.");
				Random random = new Random();
				int r = random.nextInt(256);
				int g = random.nextInt(256);
				int b = random.nextInt(256);

				Color c = new Color(r, g, b);

				panel.setBackground(c);	
			}
		});

		panel.add(btn);

		add(panel);

		setTitle("이벤트 처리 예제 #1");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
