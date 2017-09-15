package test04;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> words = new HashSet<>();
		
		words.add("단어");
		words.add("사과");
		words.add("안녕");
		words.add("단어");
		words.add("안녕");
		System.out.println(words); //한 번에 다 출력
		//현재 set에 어떤 데이터가 있는지 하나씩 확인해보고 싶으면?
		//아래의 iterator를 이용하면 집합의 데이터를 하나씩 방문"
		Iterator<String> wordIter = words.iterator();
		
		while(wordIter.hasNext())
			System.out.println("하나씩 >> " + wordIter.next());
		
	}
}
