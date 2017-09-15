import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class tt{
	JFrame jFrame = new JFrame("제목");
	JButton b1 = new JButton("일번");
	JButton b2 = new JButton("이번");
	JButton b3 = new JButton("삼번");
	
	public tt()
	{
		
		Container container = jFrame.getContentPane();
		
		container.add(b1, BorderLayout.NORTH);
		container.add(b2, BorderLayout.EAST);
		container.add(b3, BorderLayout.WEST);
		
		jFrame.setSize(300, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	}
	public static void main(String[] args) {
		new tt(); //실행
	}
}
