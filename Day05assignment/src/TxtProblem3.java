import java.util.Scanner;

public class TxtProblem3 {
	public static void main(String[] args) {

		int value;

		Scanner sc = new Scanner(System.in);

		System.out.print("10자리 이내의 정수를 입력하시오: ");
		value = sc.nextInt();

		for (int x = 0; x < 10; x++) {

			value = value / 10;

			if (value == 0) {
				System.out.println("입력하신 정수는 " + (x + 1) + "자리 수 입니다.");
				break;
			}
		}
	}
}
