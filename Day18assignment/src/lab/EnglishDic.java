package lab;

import java.util.HashMap;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		String word;

		HashMap<String, String> dic = new HashMap<>();

		dic.put("map", "지도");
		dic.put("school", "학교");
		dic.put("quit", "그만두다");

		Scanner s = new Scanner(System.in);

		do {
			System.out.print("영어 단어를 입력하시오: ");
			word = s.nextLine();

			if (word.equals("quit")) {
				System.out.println("종료 되었습니다.");
				break;
			}

			System.out.println("단어의 의미는 " + dic.get(word));
		} while (true);
	}
}
