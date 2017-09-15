package programming4;

public class Test {
	public static void main(String[] args) {
		Person[] p = new Person[3];

		p[0] = new Person("홍", 140);
		p[1] = new Person("준", 180);
		p[2] = new Person("완", 160);
		
		System.out.println("키가 가장 큰 사람: "+ getMaximum(p));
	}
	
	public static String getMaximum(Person[] p) {
		int max = 0;
		for (int i = 0; i < p.length - 1; i++) {
			if (p[max].compareTo(p[i + 1]) == -1)
				max = i + 1;
		}
		return p[max].getName();
	}
}
