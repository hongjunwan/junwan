import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		String x;
		char c;

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ��� �Է��Ͻÿ�: ");
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
			System.out.println("���� �Դϴ�.");
			break;
		default:
			System.out.println("���� �Դϴ�.");
			break;
		}

	}
}