import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		final int ARR_SIZE = 10;

		int value;
		int[] range = new int[ARR_SIZE];

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < ARR_SIZE; x++) {
			range[x] = 0;
		}

		for (int x = 0; x < ARR_SIZE; x++) {
			System.out.print("������ �Է��Ͻÿ�(1~100����): ");
			value = sc.nextInt();
			if (value < 1 || value > 100) {
				while (value < 1 || value > 100) {

					System.out.print("������ �ٽ� �Է��Ͻÿ�(1~100����): ");
					value = sc.nextInt();
				}
			}
			range[(value - 1) / 10]++;
		}

		System.out.println("�Է� �� ����");
		for (int x = 1; x <= ARR_SIZE; x++) {
			System.out.print((((x-1)*10) + 1) + " - " + (x * 10) + ": ");
			for (int y = 0; y < range[x - 1]; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
