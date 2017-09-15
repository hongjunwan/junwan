package test01;

import java.util.LinkedList;
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

		BankAccount[] bankA = new BankAccount[100];

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
				bankA[BankAccount.getCustomerCount()] = new BankAccount(name, pw, initMoney);
				bankA[BankAccount.getCustomerCount() - 1].printAccount();
				break;
			case 2: // �Ա�
				System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();
				for (int x = 0; x < BankAccount.getCustomerCount(); x++) {
					if (bankA[x].getAccountNumber().equals(accountNumber)) {
						System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
						pw = input.next();
						if (true == bankA[x].passwordCheck(pw)) {
							System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
							System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
							money = input.nextInt();
							bankA[x].deposit(money);
							System.out.println("�Ա� �� �ܾ�: " + bankA[x].getBalance());
						} else {
							count = 0;
							while (true) {
								System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
								System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
								pw = input.next();
								if (true == bankA[x].passwordCheck(pw)) {
									System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
									System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
									money = input.nextInt();
									bankA[x].deposit(money);
									System.out.println("�Ա� �� �ܾ�: " + bankA[x].getBalance());
									break;
								}
								count++;
								if (count == 4) {
									System.out.println("��й�ȣ �Է� �ʰ�.");
									break;
								}
							}
						}
						break;
					} else if (x == BankAccount.getCustomerCount() - 1
							&& bankA[x].getAccountNumber() != accountNumber) {
						System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
					}
				}
				break;
			case 3: // ���
				System.out.print("������ ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();
				for (int x = 0; x < BankAccount.getCustomerCount(); x++) {
					if (bankA[x].getAccountNumber().equals(accountNumber)) {
						System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
						pw = input.next();
						if (true == bankA[x].passwordCheck(pw)) {
							System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
							System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
							money = input.nextInt();
							bankA[x].withdraw(money);
							System.out.println("��� �� �ܾ�: " + bankA[x].getBalance());
						} else {
							count = 0;
							while (true) {
								System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
								System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
								pw = input.next();
								if (true == bankA[x].passwordCheck(pw)) {
									System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
									System.out.print("����� �ݾ��� �Է��Ͻÿ�: ");
									money = input.nextInt();
									bankA[x].withdraw(money);
									System.out.println("��� �� �ܾ�: " + bankA[x].getBalance());
									break;
								}
								count++;
								if (count == 4) {
									System.out.println("��й�ȣ �Է� �ʰ�.");
									break;
								}
							}
						}
						break;
					} else if (x == BankAccount.getCustomerCount() - 1
							&& bankA[x].getAccountNumber() != accountNumber) {
						System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
					}
				}
				break;
			case 4: // �۱�
				System.out.print("������ ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
				accountNumber = input.next();
				for (int x = 0; x < BankAccount.getCustomerCount(); x++) {
					if (bankA[x].getAccountNumber().equals(accountNumber)) {
						System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
						pw = input.next();
						if (true == bankA[x].passwordCheck(pw)) {
							System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
							System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
							otAccountNumber = input.next();
							for (int y = 0; y < BankAccount.getCustomerCount(); y++) {
								if (bankA[y].getAccountNumber().equals(otAccountNumber)) {
									System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
									System.out.println("�޴� ���� ����: " + bankA[y].getOwnerName());
									System.out.print("�½��ϱ� (YorN): ");
									check = input.next();
									if (check.charAt(0) == 'Y') {
										System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
										money = input.nextInt();
										bankA[x].transferTo(bankA[y], money);
									} else {
										System.out.println("���� �Ǿ����ϴ�.");
									}
									break;
								} else if (y == BankAccount.getCustomerCount() - 1
										&& bankA[y].getAccountNumber() != otAccountNumber) {
									System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
								}
							}
						} else {
							count = 0;
							while (true) {
								System.out.println("�߸��� ��й�ȣ �Դϴ�.�ٽ� �Է��ϼ���");
								System.out.print("��� ��ȣ�� �Է��Ͻÿ�: ");
								pw = input.next();
								if (true == bankA[x].passwordCheck(pw)) {
									System.out.println("***��й�ȣ Ȯ�� �Ϸ�***");
									System.out.print("�޴� ���� ���¹�ȣ�� �Է��Ͻÿ�: ");
									otAccountNumber = input.next();
									for (int y = 0; y < BankAccount.getCustomerCount(); y++) {
										if (bankA[y].getAccountNumber().equals(otAccountNumber)) {
											System.out.println("���� ��ȣ Ȯ�� �Ϸ�");
											System.out.println("�޴� ���� ����: " + bankA[y].getOwnerName());
											System.out.print("�½��ϱ� (YorN): ");
											check = input.next();
											if (check.charAt(0) == 'Y') {
												System.out.print("�۱��� �ݾ��� �Է��Ͻÿ�: ");
												money = input.nextInt();
												bankA[x].transferTo(bankA[y], money);
											} else {
												System.out.println("���� �Ǿ����ϴ�.");
											}
											break;
										} else if (y == BankAccount.getCustomerCount() - 1
												&& bankA[y].getAccountNumber() != otAccountNumber) {
											System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
										}

									}
								}
								count++;
								if (count == 4) {
									System.out.println("��й�ȣ �Է� �ʰ�.");
									break;
								}
							}
						}
						break;
					} else if (x == BankAccount.getCustomerCount() - 1
							&& bankA[x].getAccountNumber() != accountNumber) {
						System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
					}
				}
				break;
			case 5: // ���� ��ȸ
				System.out.print("�ܾ� ��ȸ �� ���¸� �Է��ϼ���: ");
				accountNumber = input.next();
				for (int x = 0; x < BankAccount.getCustomerCount(); x++) {
					if (bankA[x].getAccountNumber().equals(accountNumber)) {
						bankA[x].printAccount();
						break;
					} else if (x == BankAccount.getCustomerCount() - 1
							&& bankA[x].getAccountNumber() != accountNumber) {
						System.out.println("�߸��� ���¹�ȣ �Դϴ�.");
					}
				}
				break;
			case 6: // ���� ����
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				break;
			}
		}
	}
}