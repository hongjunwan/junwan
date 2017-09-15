package test02_thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Listen extends Thread {
	private BufferedReader br;

	public Listen(Socket socket) {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				System.out.print("상대방>>" + msg + "\n");
			}
		} catch (IOException e) {
			System.out.println("Listen 종료. 상대방 나간듯");
			e.printStackTrace();
		}
	}
}
