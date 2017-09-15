package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();

		System.out.println(wordList.size());

		wordList.add("준완");
		wordList.add("안녕");
		wordList.add("바나나");
		wordList.add("사과");
		wordList.add(4,"어");

		System.out.println(wordList.size());

		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
	}
}
