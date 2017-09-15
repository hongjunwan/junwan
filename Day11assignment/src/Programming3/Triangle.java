package Programming3;

public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double base;
	private double height;

	public Triangle(double side1, double side2, double base,double height) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getCircumference() {
		super.getCircumference(side1 + side2 + base);
		return side1 + side2 + base;
	}
	
	public double getArea() {
		super.getArea((base * height) / 2);
		return (base * height) / 2;
	}
	
	public String toString() {
		super.location();
		return "side1:"+side1+" side2:"+side2+" πÿ∫Ø:"+base+" ≥Ù¿Ã:"+height;
	}
}
