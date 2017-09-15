package test03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int rectX = 10, rectY = 10;

	public MyPanel() {
		addMouseListener(new MyMouseListener());
	}

	@Override
	protected void paintComponent(Graphics g) { // g는 그림을 그리기위한 붓같은거
		super.paintComponent(g); // 부모가 회색판 그리는 작업
		setBackground(Color.YELLOW);

		g.setColor(Color.RED);
		g.fillRoundRect(rectX, rectY, 50, 50, 50, 130); // x,y는 처음 시작점 width 가로 height 세로
		// 뒤에 숫자 2개 width는 가로 둥글기,height는 세로 둥글기
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 50, 50);
	}

	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("click!!(" + x + "," + y + "]");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mousePressed(MouseEvent e) {
			rectX = e.getX();
			rectY = e.getY();
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
		}
	}
}
