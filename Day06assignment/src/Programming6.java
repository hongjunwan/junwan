import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {

		String text;
		char n;
		int consonant = 0; // ����
		int vowel = 0; // ����
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
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
		System.out.println("������ ����: " + consonant + "������ ����: " + vowel);
	}
}
