package test1;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuExam {
	JFrame jFrame = new JFrame("Menu예제");
	JTextArea textArea = new JTextArea("내용 입력하세요.",5,10);
	JScrollPane jp = new JScrollPane(textArea);
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("Help");
	
	
	
}
