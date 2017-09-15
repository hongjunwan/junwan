package programming4;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private PaintPanel panel1;
	private BtnPanel panel2;
	
	public MyFrame() {
		panel1 = new PaintPanel();
		panel2 = new BtnPanel(this);
		
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);

		setTitle("박스 움직이기");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void transEventX(int x) {
		panel1.updateRectX(x);
		panel1.repaint();
		panel1.setFocusable(true);//
		panel1.requestFocus(); // 버튼 클릭 키클릭 번갈아가면서 해도 안멈추게
	}
}
