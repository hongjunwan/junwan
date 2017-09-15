package test02_thread;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 3333); //127.0.0.1 무조건 내 아이피로 인식하게 만드는거

			// 서버와 연결(socket) 확보 됐으면 쓰레드 돌려놓기
			new Speak(socket).start();
			new Listen(socket).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
