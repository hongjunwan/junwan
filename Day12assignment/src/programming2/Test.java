package programming2;

public class Test {
	public static void main(String[] args) {
		Drawable[] d = new Drawable[3];

		d[0] = new Circle();
		d[1] = new Quadrangle();
		d[2] = new Triangle();

		d[0].draw();
		d[1].draw();
		d[2].draw();
	}
}
