package problem1UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerC {
	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramPacket receivePacket = null;

		try {
			receiveSocket = new DatagramSocket(5555);

			byte[] receiveData = new byte[1024];
			receivePacket = new DatagramPacket(receiveData, receiveData.length);
			System.out.println("서버 대기....");
			while (true) {
				receiveSocket.receive(receivePacket);
				System.out.println("도착한 메세지:" + new String(receiveData));
				receiveSocket.send(receivePacket);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
