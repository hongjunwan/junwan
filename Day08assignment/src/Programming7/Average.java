package Programming7;

public class Average {
	private int a;
	private int b;
	private int c;
	
	public double getAverage(int a, int b) {
		return ((double)(a+b)/2);
	}
	
	public double getAverage(int a, int b, int c) {
		return ((double)(a+b+c)/3);
	}
}
