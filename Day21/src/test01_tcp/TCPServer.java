package test01_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket servSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// 서버가 먼저 실행해서 7777포트에서 클라이언트 기다림
			servSocket = new ServerSocket(7777);
			System.out.println("기다리는 중.....");
			socket = servSocket.accept(); // 기다림
			System.out.println("클라이언트 요청 들어옴!");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				String receiveMsg = br.readLine(); // 클라이언트 메세지 기다리기
				System.out.println("클라이언트 왈 >>" + receiveMsg);
				
				System.out.print("서버가 보낼 메세지:");
				String sendMsg = sc.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
