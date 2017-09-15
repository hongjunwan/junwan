package Programming4;

public class Point {
	private int X;
	private int Y;
	
	public void set(int x,int y) {
		X=x;
		Y=y;
	}
	
	public void print() {
		System.out.println("x: " + X + "\ny: " + Y);
	}
}
