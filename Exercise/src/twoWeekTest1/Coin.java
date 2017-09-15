package twoWeekTest1;

public class Coin {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Coin c = new Coin();
		System.out.println(c.add(1,2));
		int x = 0;
		int y;
		y = x++;
		System.out.println(y);
		y = x;
		System.out.println(y);
	}
}
