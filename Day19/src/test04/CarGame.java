package test04;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel carLb1;
	private JLabel carLb2;
	private JLabel carLb3;
	int carX1 = 100, carX2 = 100, carX3 = 100;

	class carThread extends Thread {
		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				carX1 += (int) (Math.random() * 10);
				carLb1.setBounds(carX1, 50, 50, 50);

				carX2 += (int) (Math.random() * 10);
				carLb2.setBounds(carX2, 150, 50, 50);

				carX3 += (int) (Math.random() * 10);
				carLb3.setBounds(carX3, 250, 50, 50);

				if (carX1 == 600 || carX2 == 600 || carX3 == 600) {
					break;
				}
			}
		}
	}

	public CarGame() {
		setLayout(null);

		carLb1 = new JLabel();
		carLb2 = new JLabel();
		carLb3 = new JLabel();

		carLb1.setIcon(new ImageIcon("차1.jpg"));
		carLb2.setIcon(new ImageIcon("차2.jpg"));
		carLb3.setIcon(new ImageIcon("차3.jpg"));

		carLb1.setBounds(100, 50, 50, 50);
		carLb2.setBounds(100, 150, 50, 50);
		carLb3.setBounds(100, 250, 50, 50);

		add(carLb1);
		add(carLb2);
		add(carLb3);

		(new carThread()).start();

		setTitle("자동차 게임");
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
}
