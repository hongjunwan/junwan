package lab;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;
	ArrayList<Enermy> e = new ArrayList<Enermy>();

	public MyPanel() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);

		for (int x = 0; x < 4; x++) {
			e.add(new Enermy("pic/외계인.png"));
		}
		spaceship = new SpaceShip("pic/로케트.png");
		missile = new Missile("pic/미사일.png");

		class MyThread extends Thread {
			public void run() {
				while (true) {
					for (Enermy enermy : e) {
						enermy.update();
					}
					spaceship.update();
					missile.update();

					for (int x = 0; x < e.size(); x++) {
						if (missile.x > (e.get(x).x - 60) && missile.x < (e.get(x).x + 60)
								&& missile.y > (e.get(x).y - 10) && missile.y < (e.get(x).y + 10)) {
							e.remove(x);
							missile.y = 1000;
							missile.update();
						}
					}
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
			}
		}
		Thread t = new MyThread();
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		for (Enermy enermy : e) {
			enermy.draw(g);
		}
		spaceship.draw(g);
		missile.draw(g);
	}

	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}
}