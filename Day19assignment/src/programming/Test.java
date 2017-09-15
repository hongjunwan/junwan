package programming;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	private JPanel btnPn;
	private JPanel cntPn;
	private JButton startBtn;
	private JButton stopBtn;
	private JLabel cntLb;
	private int count = 0;

	public Test() {
		btnPn = new JPanel();
		cntPn = new JPanel();
		startBtn = new JButton("카운터 시작");
		stopBtn = new JButton("카운터 중지");
		cntLb = new JLabel("0");

		cntLb.setFont(new Font("굴림", Font.BOLD, 100));

		btnPn.setLayout(new BoxLayout(btnPn, BoxLayout.Y_AXIS));

		CountListener listener = new CountListener();
		startBtn.addActionListener(listener);
		stopBtn.addActionListener(listener);

		btnPn.add(startBtn);
		btnPn.add(stopBtn);
		cntPn.add(cntLb);

		add(btnPn, BorderLayout.WEST);
		add(cntPn, BorderLayout.CENTER);

		setTitle("카운터");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class CountListener implements ActionListener {
		CountThread c = new CountThread();
		Thread t = new Thread(c);

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton selected = (JButton) e.getSource();
			if (selected == startBtn) {
				t.start();
			} else {
				t.interrupt(); //catch 실행
			}
		}
	}

	class CountThread implements Runnable {
		@Override
		public void run() {
			while (true) {
				count++;
				cntLb.setText(count + "");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { //인터럽트 발생시
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
	}

}
