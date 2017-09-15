import java.util.Scanner;

public class Programming3 {
	public static void main(String[] args) {

		String alphabet;
		int count1 = 0, count2 = 0, count3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하시오: ");
		alphabet = sc.nextLine();

		for (int x = 0; x < alphabet.length(); x++) {
			if ((alphabet.charAt(x) >= 'a' && alphabet.charAt(x) <= 'z')
					|| (alphabet.charAt(x) >= 'A' && alphabet.charAt(x) <= 'Z')) {
				count1++;
			} else if (alphabet.charAt(x) >= '0' && alphabet.charAt(x) <= '9') {
				count2++;
			} else if (alphabet.charAt(x) == ' ') {
				count3++;
			}
		}
		System.out.println("알파벳 글자의 개수: " + count1 + "\n숫자의 개수: " + count2 + "\n공백의 개수: " + count3);
	}
}
