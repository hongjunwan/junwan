/*Programming 2�� ����*/

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		int acceptmoney;
		int productprice;
		double surtax;
		int change;

		Scanner inputvalue = new Scanner(System.in);

		System.out.print("���� ��: ");
		acceptmoney = inputvalue.nextInt();
		System.out.print("��ǰ�� �Ѿ�: ");
		productprice = inputvalue.nextInt();

		surtax = productprice * 0.1;
		change = acceptmoney - productprice;

		System.out.println("�ΰ���: " + (int) surtax);
		System.out.println("�Ž�����: " + change);
	}
}
