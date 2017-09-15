package programming4;

public class Person implements Comparable {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		int otherHeight = ((Person) o).height;
		if (this.height > otherHeight) {
			return 1;
		} else if (this.height < otherHeight) {
			return -1;
		} else {
			return 0;
		}
	}
}
