package problem1TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerC {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		Scanner sc = new Scanner(System.in);

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버 대기");
			socket = serverSocket.accept();
			System.out.println("클라이언트 요청 들어옴");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			while (true) {
				String receiveMsg = br.readLine();
				System.out.println("클라이언트: " + receiveMsg);
				
				bw.write(receiveMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
