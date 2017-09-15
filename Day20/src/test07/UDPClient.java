package test07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket sendSocket = null;
		DatagramPacket sendPacket = null;
		
		try {
			sendSocket = new DatagramSocket();
			byte[] sendData = "��".getBytes(); //�ʿ��� ũ�⸸ŭ ����Ʈ�� �߶� ����
			
			sendPacket = new DatagramPacket(sendData, sendData.length,InetAddress.getByName("70.12.115.50"), 5555);
					//(������,������ũ��,������ �������ּ�,��������Ʈ)
			sendSocket.send(sendPacket);
			System.out.println("������");
		} catch (SocketException e) {
			System.out.println("������ ���� ���� ����");
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.out.println("�����Ǹ� �߸� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		}
	}
}
