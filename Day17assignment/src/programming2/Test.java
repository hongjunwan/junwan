package programming2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		HandGame h = new HandGame();
		int handValue;

		Scanner s = new Scanner(System.in);

		System.out.print("하나를 선택하시오: 가위(0), 바위(1), 보(2): ");
		handValue = s.nextInt();

		h.setUser(handValue);
		if (handValue >= 0 && handValue <= 2) {
			h.goGame();
		}
		else {
			System.out.println("사용자 값을 잘못 입력하였습니다.");
		}
	}
}
