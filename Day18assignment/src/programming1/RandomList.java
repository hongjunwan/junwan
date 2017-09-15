package programming1;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	ArrayList<T> list = new ArrayList<T>();
	int randomValue;

	public void add(T item) {
		list.add(item);
	}

	public T select() {
		randomValue = new Random().nextInt(list.size());
		return list.get(randomValue);
	}

	public static void main(String[] args) {
		RandomList<Integer> list = new RandomList<Integer>();

		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		System.out.println("·£´ý: " + list.select());
	}
}