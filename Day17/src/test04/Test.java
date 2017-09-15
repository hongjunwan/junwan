package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("나눗셈 프로그램을 진행합니다.");

		try {
			System.out.print("숫자 1 입력 >> ");
			n1 = sc.nextInt();
			System.out.print("숫자 2 입력 >> ");
			n2 = sc.nextInt();

			System.out.println("몫: " + (n1 / n2));
			System.out.println("나머지 :" + (n1 % n2)); // 만약 시도하다 실패를하면 catch로 가라
		} catch (ArithmeticException ex) {
			System.out.println("두번쨰 숫자는 0안돼");
		} catch (InputMismatchException ex) {
			System.out.println("숫자....숫자");
		} catch (Exception ex) {             //가장 최상위 부모 예외 처리 클래스라서 맨위에 쓰면 여기에 포함된 클래스를 아래에 쓰면
											//에러가 생김 그래서 따로따로 경우에 따라 나누고 싶을때는 작은거 부터 위에 써야함
			System.out.println("예상 못함");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
