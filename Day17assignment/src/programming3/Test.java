package programming3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Language l = new Language();
		String t;

		Scanner s = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		t = s.nextLine();

		l.setText(t);
		System.out.println("��� " + l.wordNumber() + "���� �ܾ �ֽ��ϴ�.");
	}
}
