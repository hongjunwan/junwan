package test01_tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket(InetAddress.getByName("70.12.115.81"), 7777);

			System.out.println("������ ����Ƴ�?!");
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				System.out.println("�������� ���� ��:");
				String sendMsg = sc.nextLine();

				bw.write(sendMsg + "\n");
				bw.flush();
				
				String receiveMsg = br.readLine();
				System.out.println("���� ��>>" + receiveMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
