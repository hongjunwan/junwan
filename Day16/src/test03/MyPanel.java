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
	protected void paintComponent(Graphics g) { // g�� �׸��� �׸������� �װ�����
		super.paintComponent(g); // �θ� ȸ���� �׸��� �۾�
		setBackground(Color.YELLOW);

		g.setColor(Color.RED);
		g.fillRoundRect(rectX, rectY, 50, 50, 50, 130); // x,y�� ó�� ������ width ���� height ����
		// �ڿ� ���� 2�� width�� ���� �ձ۱�,height�� ���� �ձ۱�
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
