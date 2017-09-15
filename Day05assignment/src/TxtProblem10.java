import java.util.Scanner;

public class TxtProblem10 {
	public static void main(String[] args) {

		int num, sum = 0;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		num = sc.nextInt();

		while (true) {
			result = num % 10;
			num = num / 10;
			sum = sum + result;
			
			if (num == 0) {
				break;
			}
		}
		System.out.println("각 자리수의 합: " + sum);
	}
}
