import java.util.Scanner;

public class TxtProblem3 {
	public static void main(String[] args) {

		int value;

		Scanner sc = new Scanner(System.in);

		System.out.print("10�ڸ� �̳��� ������ �Է��Ͻÿ�: ");
		value = sc.nextInt();

		for (int x = 0; x < 10; x++) {

			value = value / 10;

			if (value == 0) {
				System.out.println("�Է��Ͻ� ������ " + (x + 1) + "�ڸ� �� �Դϴ�.");
				break;
			}
		}
	}
}
