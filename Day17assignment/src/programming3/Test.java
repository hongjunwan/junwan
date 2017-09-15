package programming3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Language l = new Language();
		String t;

		Scanner s = new Scanner(System.in);

		System.out.print("문자열을 입력하시오: ");
		t = s.nextLine();

		l.setText(t);
		System.out.println("모두 " + l.wordNumber() + "개의 단어가 있습니다.");
	}
}
