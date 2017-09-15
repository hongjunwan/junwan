package programming5;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private JLabel lb;

	public MyFrame() {
		lb = new JLabel("Don't cry before you are hurt.");
		lb.setFont(new Font("serif", Font.BOLD, 50));
		
		lb.addMouseListener(new ChangeLanguage());
		
		add(lb);
		
		setTitle("한 영 변환기");
		setSize(600, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class ChangeLanguage implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			lb.setText("다치기도 전에 울지말라");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			lb.setText("Don't cry before you are hurt.");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
