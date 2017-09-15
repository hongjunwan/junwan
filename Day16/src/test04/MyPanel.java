package test04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int rectX = 10, rectY = 10;
	private int rectWidth, rectHeight;
	
	public MyPanel() {
		MyPaintListener listener = new MyPaintListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);	
	}

	@Override
	protected void paintComponent(Graphics g) { // g는 그림을 그리기위한 붓같은거
		super.paintComponent(g); // 부모가 회색판 그리는 작업
		setBackground(Color.YELLOW);

		g.setColor(Color.RED);
		g.fillRect(rectX, rectY, rectWidth, rectHeight);
	}
	
	class MyPaintListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			rectWidth = e.getX() - rectX;
			rectHeight = e.getY() - rectY;
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
