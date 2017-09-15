package lab;

import java.util.HashMap;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		String word;

		HashMap<String, String> dic = new HashMap<>();

		dic.put("map", "����");
		dic.put("school", "�б�");
		dic.put("quit", "�׸��δ�");

		Scanner s = new Scanner(System.in);

		do {
			System.out.print("���� �ܾ �Է��Ͻÿ�: ");
			word = s.nextLine();

			if (word.equals("quit")) {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}

			System.out.println("�ܾ��� �ǹ̴� " + dic.get(word));
		} while (true);
	}
}
