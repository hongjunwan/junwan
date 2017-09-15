package programming7;

import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {
		int x;
		int count = 0;

		HashSet<Integer> ltNumberList = new HashSet<Integer>();

		System.out.println("******·Î¶Ç ÃßÃ·*******");
		for (int y = 0; y < 6; y++) {

			do {
				x = (int) (Math.random() * 45) + 1;
			} while (ltNumberList.contains(x));
			ltNumberList.add(x);
		}
		System.out.println(ltNumberList);
	}
}
