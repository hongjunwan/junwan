import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {

		int value;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		value = sc.nextInt();

		if (value > 0) {
			for (int x = 0; x <= value; x++) {
				if (x % 3 == 0 && x != 0) {
					System.out.println("3의 배수: " + x);
				}
			}
		} 
		else {
			System.out.println("error");
		}
	}
}
