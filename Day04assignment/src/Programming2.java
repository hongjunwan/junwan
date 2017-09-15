import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		String x;
		char c;

		Scanner sc = new Scanner(System.in);

		System.out.print("영문자 하나를 입력하시오: ");
		x = sc.next();
		c = x.charAt(0);

		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("모음 입니다.");
			break;
		default:
			System.out.println("자음 입니다.");
			break;
		}

	}
}