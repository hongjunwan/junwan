package mapBank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		// ���α׷� ���࿡ �ʿ��� ���� ����
		String name;
		String pw;
		String accountNumber;
		String otAccountNumber;
		String check;
		int initMoney;
		int money;
		int count = 0;

		HashMap<String, BankAccount> bankA = new HashMap<String, BankAccount>();
		// LinkedList<BankAccount> bankA = new LinkedList<>();
		// BankAccount[] bankA = new BankAccount[100];

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // ����
				System.out.print("�̸��� �Է��Ͻÿ�: ");
				name = input.next();
				System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
				pw = input.next();
				System.out.print("�ʱ� �ݾ��� �Է��Ͻÿ�: ");
				initMoney = input.nextInt();
				BankAccount bank = new BankAccount();
				bankA.put(bank.getAccountNumber(), new BankAccount(name, pw, initMoney));
				bankA.get(bank.getAccountNumber()).printAccount();
				break;
			case 2: // �Ա�
				System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
						System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
						money = input.nextInt();
						bankA.get(accountNumber).deposit(money);
						System.out.println("�Ա� �� �ܾ�: " + bankA.get(accountNumber).getBalance());
					} else {
						count = 0;
						while (true) {
							System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
							System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
								System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
								money = input.nextInt();
								bankA.get(accountNumber).deposit(money);
								System.out.println("�Ա� �� �ܾ�: " + bankA.get(accountNumber).getBalance());
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("��й�ȣ �Է� �ʰ�.");
								break;
							}
						}
					}
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 3: // ���
				System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();

				if (bankA.get(accountNumber) != null) {
					System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
						System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
						money = input.nextInt();
						bankA.get(accountNumber).withdraw(money);
						System.out.println("��� �� �ܾ�: " + bankA.get(accountNumber).getBalance());
					} else {
						count = 0;
						while (true) {
							System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
							System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
								System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
								money = input.nextInt();
								bankA.get(accountNumber).withdraw(money);
								System.out.println("��� �� �ܾ�: " + bankA.get(accountNumber).getBalance());
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("��й�ȣ �Է� �ʰ�.");
								break;
							}
						}
					}
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 4: // �۱�
				System.out.print("������ ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();

				if (bankA.get(accountNumber) != null) {
					System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
						System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
						otAccountNumber = input.next();
						if (bankA.get(otAccountNumber) != null) {
							System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
							System.out.println("�޴� ���� ����: " + bankA.get(otAccountNumber).getOwnerName());
							System.out.print("�½��ϱ� (YorN): ");
							check = input.next();
							if (check.charAt(0) == 'Y') {
								System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
								money = input.nextInt();
								bankA.get(accountNumber).transferTo(bankA.get(otAccountNumber), money);
							} else {
								System.out.println("���� �Ǿ����ϴ�.");
							}
						} else {
							System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
						}
					} else {
						count = 0;
						while (true) {
							System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
							System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
								System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
								otAccountNumber = input.next();
								if (bankA.get(otAccountNumber) != null) {
									System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
									System.out.println("�޴� ���� ����: " + bankA.get(otAccountNumber).getOwnerName());
									System.out.print("�½��ϱ� (YorN): ");
									check = input.next();
									if (check.charAt(0) == 'Y') {
										System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
										money = input.nextInt();
										bankA.get(accountNumber).transferTo(bankA.get(otAccountNumber), money);
									} else {
										System.out.println("���� �Ǿ����ϴ�.");
									}
								} else {
									System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
								}
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("��й�ȣ �Է� �ʰ�.");
								break;
							}
						}
					}
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 5: // ���� ��ȸ
				System.out.print("�ܾ� ��ȸ �� ���¸� �Է��ϼ���: ");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					bankA.get(accountNumber).printAccount();
					break;
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
				break;
			case 6: // ���� ����
				System.out.println("������ ���¸� �Է��ϼ���.");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					bankA.remove(accountNumber);
					System.out.println("���°� �����Ǿ����ϴ�.");
				} else {
					System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
				}
				break;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				break;
			}
		}
	}
}