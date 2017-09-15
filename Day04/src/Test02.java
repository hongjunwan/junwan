import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		int rate = 50000;
		int pay;
		int hours;

		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간 입력: ");
		hours = sc.nextInt();

		if (hours > 8) {
			pay = 8 * rate + (int) ((hours - 8) * rate * 1.5);
		} else {
			pay = 8 * rate;
		}

		System.out.println("지급 금액: " + pay);
	}
}
