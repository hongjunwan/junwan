package test05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton[] btns;
	private JPanel panelBtns;
	
	public MyFrame() {
		panelBtns = new JPanel();
		btns = new JButton[5];
		
		panelBtns.setBackground(Color.YELLOW);
		//JPanel�� �⺻ ��ġ�����ڰ� FlowLayout���� �Ǿ�����
		panelBtns.setLayout(new FlowLayout());
		//JFrame�� �⺻ ��ġ�����ڰ� BorderLayout��
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		
		for(int i = 0; i<btns.length; i++){
			btns[i] = new JButton("��ư" + i);
			panelBtns.add(btns[i]); //�гο� ��ư �߰� �ݺ�
		}
		
		add(panelBtns); //�г��� �����ӿ� ���̱�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();//ȭ�� ���缭 ����
	}			
}
