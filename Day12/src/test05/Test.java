package test05;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10, 100, 200);
		
		System.out.println(calcArea(r));
		System.out.println(calcArea(new Circle(10, 500, 30)));
	}

	public static double calcArea(Shape s) {
		double result;
		if (s instanceof Rectangle) {
			result = ((Rectangle) s).getWidth() * ((Rectangle)s).getHeight();
		} else if (s instanceof Circle) {
			result = ((Circle) s).getRadius() * ((Circle)s).getRadius() * 3.14;
		} else {
			result = -1;
		}
		return result;
	}
}
