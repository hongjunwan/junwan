package programming5;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public double calcArea() {
		return length * width;
	}

	public String toString() {
		System.out.print(super.toString());
		return " »ç°¢Çü ³ÐÀÌ:" + calcArea();
	}
}
