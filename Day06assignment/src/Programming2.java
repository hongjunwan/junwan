import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		String question;
		int r;
		double area;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("���� �������� �Է��Ͻÿ�: ");
			r = sc.nextInt();

			area = r * r * 3.1415;

			System.out.println("���� ����: " + area);
			System.out.print("����Ͻðڽ��ϱ�(Y or N)? ");
			question = sc.next();

			if (question.equalsIgnoreCase("y") || question.equalsIgnoreCase("n")) {
				question = question.toUpperCase();
				System.out.println("�빮�ڷ� ���� " + question);
			}
		} while (question.equalsIgnoreCase("Y"));
	}
}
