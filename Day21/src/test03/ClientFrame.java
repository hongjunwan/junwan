package test03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientFrame extends JFrame {
	// 그래픽 관련 멤버변수
	private JTextArea textArea = new JTextArea();
	private JTextField textField = new JTextField();
	////////////////////////////////////////////////////////
	private BufferedWriter bw;
	private BufferedReader br;

	public ClientFrame() {
		// 그래픽 환경 초기화 작업
		textArea.setEditable(false);
		textField.setBackground(Color.PINK);

		textField.addActionListener(new MyListener());

		add(new JScrollPane(textArea), BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
		setTitle("클라이언트");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		initTcpIp();

	}

	// 네트워크 초기화 작업(클라이언트)
	public void initTcpIp() {
		try {	
			Socket socket = new Socket("127.0.0.1", 2222);
			

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new ReceiveThread().start(); //연결되고 나면 메세지 수신 쓰레드 시작시키기
		} catch (IOException e) {
			System.out.println("클라이언트 네트워크 초기화 오류");
			e.printStackTrace();
		}
	}

	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			String writeMsg = textField.getText();

			textArea.append("나:" + writeMsg + "\n");
			textField.setText("");

			try {
				if (bw != null) {
					bw.write(writeMsg + "\n");
					bw.flush();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	class ReceiveThread extends Thread {
		@Override
		public void run() {
			try {
				while (true) {
					String receiveMsg = br.readLine();
					textArea.append("서버:" + receiveMsg + "\n");
				}
			} catch (IOException e) {
				System.out.println("클라이언트 퇴장함\n");
				e.printStackTrace();
			}
		}
	}

	//////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		ClientFrame f = new ClientFrame();
	}
}