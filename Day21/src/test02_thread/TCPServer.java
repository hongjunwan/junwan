package test02_thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(3333);
			System.out.println("wait..........");
			Socket socket = serverSocket.accept();
			System.out.println("accept!!!" + socket.getInetAddress());

			// ���� (socket) Ȯ�� ���Ŀ��� ������ �ΰ� ��������
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
