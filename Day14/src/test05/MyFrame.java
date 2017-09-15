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
		//JPanel은 기본 배치관리자가 FlowLayout으로 되어있음
		panelBtns.setLayout(new FlowLayout());
		//JFrame은 기본 배치관리자가 BorderLayout임
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		
		for(int i = 0; i<btns.length; i++){
			btns[i] = new JButton("버튼" + i);
			panelBtns.add(btns[i]); //패널에 버튼 추가 반복
		}
		
		add(panelBtns); //패널을 프레임에 붙이기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();//화면 맞춰서 생성
	}			
}
