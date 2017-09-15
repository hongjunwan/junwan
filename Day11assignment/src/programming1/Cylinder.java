package programming1;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		height = 2.0;
	}
	public Cylinder(double radius) {
		super(radius);
		height = 3.0;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea() * height;
	}
}
