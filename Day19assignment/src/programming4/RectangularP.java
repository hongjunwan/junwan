package programming4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class RectangularP extends JPanel {
	private int rectW = 100;
	private int rectH = 100;
	private int x = 1;

	@Override
	protected void paintComponent(Graphics g) { // g는 그림을 그리기위한 붓같은거
		super.paintComponent(g); // 부모가 회색판 그리는 작업 //while문은 안됌 메소드를 새로 호출해야함
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.setColor(Color.RED);
			g.fillRect(50, 50, rectW, rectH);
			
			if(x == 1) {
				rectW -= 10;
				rectH -= 10;
				if(rectW == 20) {
					x = 2;
				}
			}
			else {
				rectW += 10;
				rectH += 10;
				if(rectW == 100) {
					x = 1;
				}
			}
			repaint();
	}
}