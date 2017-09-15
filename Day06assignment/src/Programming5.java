import java.util.Scanner;

public class Programming5 {
	public static void main(String[] args) {

		String text;

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하시오: ");
		text = sc.next();

		System.out.print("역순: ");
		for (int x = text.length(); x - 1 >= 0; x--) {
			System.out.print(text.charAt(x - 1));
		}

	}
}
