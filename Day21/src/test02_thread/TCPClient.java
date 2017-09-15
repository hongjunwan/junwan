package test02_thread;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 3333); //127.0.0.1 ������ �� �����Ƿ� �ν��ϰ� ����°�

			// ������ ����(socket) Ȯ�� ������ ������ ��������
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
