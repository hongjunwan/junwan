package programming4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtnPanel extends JPanel {
	private MyFrame cont;
	
	private JButton leftBtn;
	private JButton rightBtn;

	public BtnPanel(MyFrame cont) {
		this.cont = cont;
		
		leftBtn = new JButton("왼쪽으로 이동");
		rightBtn = new JButton("오른쪽으로 이동");
		
		MoveAction listener = new MoveAction();
		leftBtn.addActionListener(listener);
		rightBtn.addActionListener(listener); //버튼 클릭
		
		add(leftBtn);
		add(rightBtn);
	}

	class MoveAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton selected = (JButton) e.getSource();
			if (selected == leftBtn) {
				cont.transEventX(-10);
			} else {
				cont.transEventX(10);
			}
		}
	}

	
}
