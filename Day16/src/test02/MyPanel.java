package test02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private int rectX = 10, rectY = 10;

	public MyPanel() {

		// �г��� �⺻������ Ű���� ��Ŀ���� �޴� ������Ʈ�� �ƴ�.
		// �Ʒ� ó�� ���������� ��Ŀ���� �ް� �������
		requestFocus();
		setFocusable(true);

		// Ű���� �̺�Ʈ ó���� ����ϱ�
		addKeyListener(new MyKeyListener());
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

	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent ev) {
			System.out.println(ev.getKeyCode() + "," + ev.getKeyChar() + "," + ev.isControlDown());

			if (ev.getKeyCode() == KeyEvent.VK_UP || ev.getKeyCode() == KeyEvent.VK_W) {
				rectY -= 5;
			} else if (ev.getKeyCode() == KeyEvent.VK_DOWN || ev.getKeyCode() == KeyEvent.VK_S) {
				rectY += 5;
			} else if (ev.getKeyCode() == KeyEvent.VK_LEFT || ev.getKeyCode() == KeyEvent.VK_A) {
				rectX -= 5;
			} else if (ev.getKeyCode() == KeyEvent.VK_RIGHT || ev.getKeyCode() == KeyEvent.VK_D) {
				rectX += 5;
			}
			repaint(); // ����� ������ ȭ���� �ٽ� �׷������.
		}

		@Override
		public void keyReleased(KeyEvent ev) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent ev) {
			// TODO Auto-generated method stub

		}
	}
	
	//���� ���� �������̽� implements �ؼ� ��� �߻�޼ҵ带 
	//�����ϰ� ���� ���� ���� �Ʒ�ó�� Adapter Ŭ������ ���
	//���� �� ���ϴ� �޼ҵ常 �������̵� ������.
	//KeyListener���� ��� �޼ҵ带 ���� �����ؾ� ������ �Ʒ��� ���� KeyAdapter�� ����ϸ�
	//���ϴ� �޼ҵ常 �����ϸ� �ȴ�.
	class MyKeyListener2 extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//Ű�� �������� ���� �� ���� ����
		}
	}
}
