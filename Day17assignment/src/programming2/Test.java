package programming2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		HandGame h = new HandGame();
		int handValue;

		Scanner s = new Scanner(System.in);

		System.out.print("�ϳ��� �����Ͻÿ�: ����(0), ����(1), ��(2): ");
		handValue = s.nextInt();

		h.setUser(handValue);
		if (handValue >= 0 && handValue <= 2) {
			h.goGame();
		}
		else {
			System.out.println("����� ���� �߸� �Է��Ͽ����ϴ�.");
		}
	}
}
