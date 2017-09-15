package lab2;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수의 개수: ");

			count = sc.nextInt();
			list = new int[count];

			for (int i = 0; i < count; i++) {
				System.out.print("정수를 입력하시오: ");
				list[i] = sc.nextInt();
			}
			for (int i = 0; i < count; i++) {
				sum += list[i];
			}
			System.out.println("평균은" + sum / count);
		} catch (ArithmeticException e) {
			System.out.println("숫자 0 안돼요");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스 값입니다.");
		} catch (NullPointerException e) {
			System.out.println("참조변수가 null로 초기화 되어 있습니다.");
		}
	}
}
