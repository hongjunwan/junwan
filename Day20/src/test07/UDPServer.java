package test07; //��Ʈ��ũ ����

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket receiveSocket = null;
		DatagramPacket receivePacket = null;
		

		try {
			receiveSocket = new DatagramSocket(5555);
			while (true) {
				byte[] receiveData = new byte[1024];
				receivePacket = new DatagramPacket(receiveData, receiveData.length);
				System.out.println("���� ����... ��ٸ��� ��.....");
				receiveSocket.receive(receivePacket); // ��ٸ�
				System.out.println("������ �޼���:" + new String(receiveData));
			}
		} catch (SocketException e) {
			System.out.println("��Ʈ �浹��");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�޼��� �޴� ���� ���� �߻���");
			e.printStackTrace();
		}
	}
}
