package lab;

import java.util.Scanner;

public class BankAcoountTest {
	public static void main(String[] args) {
		int number, value;

		Scanner sc = new Scanner(System.in);

		BankAccount b = new BankAccount();

		b.balance = 100;

		System.out.println("1.���� 2.���� 3.�� ���� �ݾ� Ȯ�� 4.���� �ݾ� Ȯ�� 5.����");

		do {
			System.out.print("���Ͻô� ������ �������ּ���: ");
			number = sc.nextInt();

			switch (number) {
			case 1: {
				System.out.println("���� �ݾ�: " + b.getBalance());
				System.out.print("������ �ݾ��� �Է��ϼ���: ");
				value = sc.nextInt();
				b.deposit(value);
				System.out.println("���� �� �ݾ�: " + b.getBalance());
				break;
			}
			case 2: {
				System.out.println("���� �ݾ�: " + b.getBalance());
				System.out.print("������ �ݾ��� �Է��ϼ���: ");
				value = sc.nextInt();
				b.withdraw(value);
				System.out.println("���� �� �ݾ�: " + b.getBalance());
				break;
			}
			case 3: {
				System.out.println("���� �ݾ�: " + b.getBalance());
				b.addInterest();
				System.out.println("���� �ݾ׿� ���� �� ���� �߰� �ݾ�(���� �ݾ� Ȯ�ο�): " + b.addBalance());
				break;
			}
			case 4: {
				System.out.println("���� �ݾ�: " + b.getBalance());
				break;
			}
			case 5: {
				System.out.println("���� �Ǿ����ϴ�.");
			}
			}
		} while (number != 5);
	}
}