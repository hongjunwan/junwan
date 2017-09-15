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

		// 패널은 기본적으로 키보드 포커스를 받는 컴포넌트가 아님.
		// 아래 처럼 인위적으로 포커스를 받게 해줘야함
		requestFocus();
		setFocusable(true);

		// 키보드 이벤트 처리기 등록하기
		addKeyListener(new MyKeyListener());
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
			repaint(); // 변경된 정보로 화면을 다시 그려줘야함.
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
	
	//위와 같이 인터페이스 implements 해서 모든 추상메소드를 
	//구현하고 싶지 않을 때는 아래처럼 Adapter 클래스를 상속
	//받은 뒤 원하는 메소드만 오버라이딩 가능함.
	//KeyListener같은 경우 메소드를 전부 정의해야 하지만 아래와 같이 KeyAdapter를 사용하면
	//원하는 메소드만 정의하면 된다.
	class MyKeyListener2 extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//키가 눌렸을때 실행 할 문장 적기
		}
	}
}
