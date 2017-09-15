package test03;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btnCount, btnReset;
	private JLabel lbCount;
	private JPanel panelCount, panelBtn;
	private int count = 0;

	public MyFrame() {
		// 그래픽 컴포넌트 객체 생성
		btnCount = new JButton("count");
		btnReset = new JButton("reset");
		lbCount = new JLabel("0");
		panelCount = new JPanel();
		panelBtn = new JPanel();

		// 버튼 이벤트처리기 등록
		CountListener listener = new CountListener();
		btnCount.addActionListener(listener);
		btnReset.addActionListener(listener);

		// 배치관리자 설정해서 컴포넌트들을 컨테이너에 추가
		panelBtn.setLayout(new GridLayout(1, 2));
		panelBtn.add(btnCount);
		panelBtn.add(btnReset);

		lbCount.setFont(new Font("굴림", Font.BOLD, 100));
		panelCount.add(lbCount);

		add(panelCount, BorderLayout.CENTER);
		add(panelBtn, BorderLayout.PAGE_END);

		// 프레임 기본설계
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	//////////////////////////////////////////////////////////
	class CountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton selected = (JButton) e.getSource();
			if (selected == btnCount) {
				count++;
			} else if (selected == btnReset) {
				count = 0;
			}
			lbCount.setText(count + " "); // 이렇게 공백 문자 추가해서 문자로 가능
			// 아래처럼 JLabel의 값을 가져와서 숫자로 변환가능.
			// JButton selected = (JButton) e.getSource();
			// if(selected == btnCount) {
			// String numText = lbCount.getText(); // "0"
			// int num = Integer.parseInt(numText);
			// lbCount.setText(num++ +"");
			// }else if(selected == btnReset) {
			// lbCount.setText("0");
			// }
		}
	}

	///////////////////////////////////////////////////////////
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
