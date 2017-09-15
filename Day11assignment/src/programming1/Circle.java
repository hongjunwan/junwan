package programming1;

public class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 2.0;
		color = "white";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}

	public String getColor() {
		return color;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.1415;
	}
}
