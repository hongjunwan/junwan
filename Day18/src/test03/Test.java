package test03;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();

		System.out.println(wordList.size());

		wordList.add("�ؿ�");
		wordList.add("�ȳ�");
		wordList.add("�ٳ���");
		wordList.add("���");
		wordList.add(4,"��");

		System.out.println(wordList.size());

		for (int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
	}
}
