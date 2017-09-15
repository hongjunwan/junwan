package problem1UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientC {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramPacket sendPacket = null;
		
		Scanner sc = new Scanner(System.in);

		try {
			sendSocket = new DatagramSocket();
			while (true) {
				System.out.print("보낼 메세지:");
				String sendmsg = sc.nextLine();
				byte[] sendData = sendmsg.getBytes();

				sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("127.0.0.1"), 5555);
				sendSocket.send(sendPacket);
				System.out.println("보냈음");
				sendSocket.receive(sendPacket);
				System.out.println("도착한 메세지:" + new String(sendData));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
