package test01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g) { //g는 그림을 그리기위한 붓같은거
		super.paintComponent(g); //부모가 회색판 그리는 작업
		setBackground(Color.YELLOW);
		
		g.setColor(Color.RED);
		g.fillRoundRect(10, 10, 50, 50, 50, 130); //x,y는 처음 시작점 width 가로 height 세로 
												  //뒤에 숫자 2개 width는 가로 둥글기,height는 세로 둥글기
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 50, 50);
	}
}
