package programming4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int rectX = 184;

	public PaintPanel() {
		setFocusable(true);

		addKeyListener(new MoveListener());
	}

	public void updateRectX(int x) {
		if (rectX > 5 && rectX < 360) {
			rectX += x;
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.YELLOW);

		g.setColor(Color.RED);
		g.fillRect(rectX, 10, 16, 200);
	}

	class MoveListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent ev) {
			if (ev.getKeyCode() == KeyEvent.VK_LEFT || ev.getKeyCode() == KeyEvent.VK_A) {
				if (rectX > 5) {
					rectX -= 10;
				}
			} else if (ev.getKeyCode() == KeyEvent.VK_RIGHT || ev.getKeyCode() == KeyEvent.VK_D) {
				if (rectX < 360) {
					rectX += 10;
				}
			}
			repaint();
		}
	}
}
