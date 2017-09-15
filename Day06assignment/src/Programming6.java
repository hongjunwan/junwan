import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {

		String text;
		char n;
		int consonant = 0; // 자음
		int vowel = 0; // 모음
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하시오: ");
		text = sc.next();

		for (int x = 0; x < text.length(); x++) {
			n = text.charAt(x);

			if ((n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')
					|| (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U')) {
				vowel++;
			} 
			else {
				consonant++;
			}
		}
		System.out.println("자음의 개수: " + consonant + "모음의 개수: " + vowel);
	}
}
