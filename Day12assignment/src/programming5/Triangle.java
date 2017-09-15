package programming5;

public class Triangle extends Shape{
	private double base;
	private double height;
	private String a;
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public double calcArea() {
		return (base * height)/2;
	}

	public String toString() {
		System.out.println(a);
		System.out.print(super.toString());
		return " »ï°¢Çü ³ÐÀÌ:" + calcArea();
	}
}
