import java.util.Scanner;

public class Programming4 {
	public static void main(String[] args) {

		String text;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하시오: ");
		text = sc.nextLine();

		for (int x = 0; x < text.length(); x++) {
			if (text.charAt(x) == ' ') {
				cnt++;
			}
		}
		System.out.println("단어의 개수: " + (cnt + 1));

	}
}
