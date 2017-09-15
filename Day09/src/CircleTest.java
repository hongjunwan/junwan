class Point{
	int x;
	int y;
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle{
	int radius = 0;
	Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Point p = new Point(25,78);
		Circle c = new Circle(p,10);
		System.out.println(c.center.x);
	}

}
