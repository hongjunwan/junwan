package test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) { //g�� �׸��� �׸������� �װ�����
		super.paintComponent(g); //�θ� ȸ���� �׸��� �۾�
		setBackground(Color.YELLOW);
		
		g.setColor(Color.RED);
		g.fillRoundRect(10, 10, 50, 50, 50, 130); //x,y�� ó�� ������ width ���� height ���� 
												  //�ڿ� ���� 2�� width�� ���� �ձ۱�,height�� ���� �ձ۱�
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 50, 50);
	}
}
