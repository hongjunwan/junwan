package programming4;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private RectangularP panel;
	
	public MyFrame() {
		panel = new RectangularP();
		
		add(panel);
		
		setTitle("사각형 변화");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
