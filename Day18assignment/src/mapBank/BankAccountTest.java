package mapBank;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		// 프로그램 진행에 필요한 변수 선언
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
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // 가입
				System.out.print("이름을 입력하시오: ");
				name = input.next();
				System.out.print("비밀번호를 입력하시오: ");
				pw = input.next();
				System.out.print("초기 금액을 입력하시오: ");
				initMoney = input.nextInt();
				BankAccount bank = new BankAccount();
				bankA.put(bank.getAccountNumber(), new BankAccount(name, pw, initMoney));
				bankA.get(bank.getAccountNumber()).printAccount();
				break;
			case 2: // 입금
				System.out.print("본인의 계좌번호를 입력하시오: ");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					System.out.print("비밀 번호를 입력하시오: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***비밀번호 확인 완료***");
						System.out.print("입금할 금액을 입력하시오: ");
						money = input.nextInt();
						bankA.get(accountNumber).deposit(money);
						System.out.println("입금 후 잔액: " + bankA.get(accountNumber).getBalance());
					} else {
						count = 0;
						while (true) {
							System.out.println("잘못된 비밀번호 입니다.다시 입력하세요");
							System.out.print("비밀 번호를 입력하시오: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***비밀번호 확인 완료***");
								System.out.print("입금할 금액을 입력하시오: ");
								money = input.nextInt();
								bankA.get(accountNumber).deposit(money);
								System.out.println("입금 후 잔액: " + bankA.get(accountNumber).getBalance());
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("비밀번호 입력 초과.");
								break;
							}
						}
					}
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
				}
				break;
			case 3: // 출금
				System.out.print("본인의 계좌번호를 입력하시오: ");
				accountNumber = input.next();

				if (bankA.get(accountNumber) != null) {
					System.out.print("비밀 번호를 입력하시오: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***비밀번호 확인 완료***");
						System.out.print("출금할 금액을 입력하시오: ");
						money = input.nextInt();
						bankA.get(accountNumber).withdraw(money);
						System.out.println("출금 후 잔액: " + bankA.get(accountNumber).getBalance());
					} else {
						count = 0;
						while (true) {
							System.out.println("잘못된 비밀번호 입니다.다시 입력하세요");
							System.out.print("비밀 번호를 입력하시오: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***비밀번호 확인 완료***");
								System.out.print("출금할 금액을 입력하시오: ");
								money = input.nextInt();
								bankA.get(accountNumber).withdraw(money);
								System.out.println("출금 후 잔액: " + bankA.get(accountNumber).getBalance());
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("비밀번호 입력 초과.");
								break;
							}
						}
					}
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
				}
				break;
			case 4: // 송금
				System.out.print("보내는 분의 계좌번호를 입력하시오: ");
				accountNumber = input.next();

				if (bankA.get(accountNumber) != null) {
					System.out.print("비밀 번호를 입력하시오: ");
					pw = input.next();
					if (true == bankA.get(accountNumber).passwordCheck(pw)) {
						System.out.println("***비밀번호 확인 완료***");
						System.out.print("받는 분의 계좌번호를 입력하시오: ");
						otAccountNumber = input.next();
						if (bankA.get(otAccountNumber) != null) {
							System.out.println("계좌 번호 확인 완료");
							System.out.println("받는 분의 성함: " + bankA.get(otAccountNumber).getOwnerName());
							System.out.print("맞습니까 (YorN): ");
							check = input.next();
							if (check.charAt(0) == 'Y') {
								System.out.print("송금할 금액을 입력하시오: ");
								money = input.nextInt();
								bankA.get(accountNumber).transferTo(bankA.get(otAccountNumber), money);
							} else {
								System.out.println("종료 되었습니다.");
							}
						} else {
							System.out.println("잘못된 계좌번호 입니다.");
						}
					} else {
						count = 0;
						while (true) {
							System.out.println("잘못된 비밀번호 입니다.다시 입력하세요");
							System.out.print("비밀 번호를 입력하시오: ");
							pw = input.next();
							if (true == bankA.get(accountNumber).passwordCheck(pw)) {
								System.out.println("***비밀번호 확인 완료***");
								System.out.print("받는 분의 계좌번호를 입력하시오: ");
								otAccountNumber = input.next();
								if (bankA.get(otAccountNumber) != null) {
									System.out.println("계좌 번호 확인 완료");
									System.out.println("받는 분의 성함: " + bankA.get(otAccountNumber).getOwnerName());
									System.out.print("맞습니까 (YorN): ");
									check = input.next();
									if (check.charAt(0) == 'Y') {
										System.out.print("송금할 금액을 입력하시오: ");
										money = input.nextInt();
										bankA.get(accountNumber).transferTo(bankA.get(otAccountNumber), money);
									} else {
										System.out.println("종료 되었습니다.");
									}
								} else {
									System.out.println("잘못된 계좌번호 입니다.");
								}
								break;
							}
							count++;
							if (count == 4) {
								System.out.println("비밀번호 입력 초과.");
								break;
							}
						}
					}
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
				}
				break;
			case 5: // 계좌 조회
				System.out.print("잔액 조회 할 계좌를 입력하세요: ");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					bankA.get(accountNumber).printAccount();
					break;
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
				}
				break;
			case 6: // 계좌 해지
				System.out.println("해지할 계좌를 입력하세요.");
				accountNumber = input.next();
				if (bankA.get(accountNumber) != null) {
					bankA.remove(accountNumber);
					System.out.println("계좌가 해지되었습니다.");
				} else {
					System.out.println("잘못된 계좌번호 입니다.");
				}
				break;
			default:
				System.out.println("입력이 잘못되었습니다.");
				break;
			}
		}
	}
}