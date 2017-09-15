package test04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();

		System.out.println(set.add("apple"));
		System.out.println(set.add("banana"));
		System.out.println(set.add("tmoato"));
		System.out.println(set.add("kor"));

		System.out.println("size:" + set.size());
		System.out.println(set);

		HashSet<Integer> numbers = new HashSet<>();
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			if (numbers.add(rand.nextInt(10)) == false) {
				i--;
			}
		}
		System.out.println(numbers);
	}
}
