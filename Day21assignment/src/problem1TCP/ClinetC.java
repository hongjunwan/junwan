package problem1TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClinetC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 7777);
			System.out.println("서버와 연결");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보낼 말: ");
				String sendMsg = sc.nextLine();
				
				bw.write(sendMsg + "\n");
				bw.flush();
				System.out.println("보냈음");
				
				String receiveMsg = br.readLine();
				System.out.println("echo: " + receiveMsg);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
