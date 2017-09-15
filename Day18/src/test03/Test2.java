package test03;

import java.util.LinkedList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<String> wordList = new LinkedList<>();

		System.out.println(wordList.size());

		wordList.add("yangyu");
		wordList.add("안녕하세요");
		wordList.add("사과");
		wordList.add(2, "banana");
		wordList.add("hungry");
		wordList.add("dsadsa");

		System.out.println(wordList.size());
		// System.out.println(wordList.get(3));

		for (int i = 0; i < wordList.size(); i++) {
			System.out.println("아무말:" + wordList.get(i));
		}
	}
}