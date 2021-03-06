package lab;

import java.util.Scanner;

public class BankAcoountTest {
	public static void main(String[] args) {
		int number, value;

		Scanner sc = new Scanner(System.in);

		BankAccount b = new BankAccount();

		b.balance = 100;

		System.out.println("1.저금 2.인출 3.연 이자 금액 확인 4.현재 금액 확인 5.종료");

		do {
			System.out.print("원하시는 업무를 선택해주세요: ");
			number = sc.nextInt();

			switch (number) {
			case 1: {
				System.out.println("현재 금액: " + b.getBalance());
				System.out.print("저금할 금액을 입력하세요: ");
				value = sc.nextInt();
				b.deposit(value);
				System.out.println("저금 후 금액: " + b.getBalance());
				break;
			}
			case 2: {
				System.out.println("현재 금액: " + b.getBalance());
				System.out.print("인출할 금액을 입력하세요: ");
				value = sc.nextInt();
				b.withdraw(value);
				System.out.println("인출 후 금액: " + b.getBalance());
				break;
			}
			case 3: {
				System.out.println("현재 금액: " + b.getBalance());
				b.addInterest();
				System.out.println("현재 금액에 대한 연 이자 추가 금액(가상 금액 확인용): " + b.addBalance());
				break;
			}
			case 4: {
				System.out.println("현재 금액: " + b.getBalance());
				break;
			}
			case 5: {
				System.out.println("종료 되었습니다.");
			}
			}
		} while (number != 5);
	}
}