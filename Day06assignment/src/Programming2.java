import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		String question;
		int r;
		double area;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("원의 반지름을 입력하시오: ");
			r = sc.nextInt();

			area = r * r * 3.1415;

			System.out.println("원의 면적: " + area);
			System.out.print("계속하시겠습니까(Y or N)? ");
			question = sc.next();

			if (question.equalsIgnoreCase("y") || question.equalsIgnoreCase("n")) {
				question = question.toUpperCase();
				System.out.println("대문자로 변경 " + question);
			}
		} while (question.equalsIgnoreCase("Y"));
	}
}
