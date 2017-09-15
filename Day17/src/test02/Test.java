package test02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈 프로그램을 진행합니다.");
		System.out.print("숫자 1 입력 >> ");
		n1 = sc.nextInt();
		System.out.print("숫자 2 입력 >> ");
		n2 = sc.nextInt();
		try {
			System.out.println("몫: " + (n1 / n2));
			System.out.println("나머지 :" + (n1 % n2)); // 만약 시도하다 실패를하면 catch로 가라
		} catch (ArithmeticException ex) {
			System.out.println("두번쨰 숫자는 0안돼");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
