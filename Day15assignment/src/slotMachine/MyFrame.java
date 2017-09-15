package slotMachine;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel panel;
	private JLabel[] numberLb;
	private JButton spinBtn;
	private int[] number;
	
	private JDialog result;
	private JLabel resultLabel;
	

	public MyFrame() {
		number = new int[3];
		panel = new JPanel();
		numberLb = new JLabel[3];
		spinBtn = new JButton("½ºÇÉ");
		
		panel.setLayout(null);

		for (int x = 0; x < numberLb.length; x++) {
			numberLb[x] = new JLabel("0");
			numberLb[x].setFont(new Font("±¼¸²", Font.BOLD, 100));
			numberLb[x].setSize(100, 100);
			numberLb[x].setLocation(100 + 100 * x, 20);
		}

		spinBtn.setSize(250, 50);
		spinBtn.setLocation(100, 150);

		spinListener listener = new spinListener();
		spinBtn.addActionListener(listener);

		for (int x = 0; x < numberLb.length; x++) {
			panel.add(numberLb[x]);
		}
		panel.add(spinBtn);

		add(panel);

		setTitle("½½·Ô¸Ó½Å");
		setSize(480, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class spinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int x = 0; x < numberLb.length; x++) {
				number[x] = (int) (Math.random() * 10);
				numberLb[x].setText(number[x] + "");
			}
			for (int x = 0; x < numberLb.length - 1; x++) {
				if (number[x] != number[x + 1]) {
					break;
				}
				else if(number[x] == number[x+1] && x == numberLb.length -2){
					result();
				}
			}
		}
	}

	void result() {
		result = new JDialog(this, "°ÔÀÓ °á°ú");
		resultLabel = new JLabel();

		resultLabel.setHorizontalAlignment(NORMAL);
		result.setBounds(150, 100, 100, 100);

		resultLabel.setText("´çÃ· µÆ½À´Ï´Ù.");

		result.add(resultLabel);
		result.setVisible(true);
		setDefaultCloseOperation(result.EXIT_ON_CLOSE);
	}
}
