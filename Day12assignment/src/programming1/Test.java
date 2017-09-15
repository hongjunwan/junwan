package programming1;

public class Test {
	public static void main(String[] args) {
		Movable[] m = new Movable[3];

		m[0] = new Circle();
		m[1] = new Quadrangle();
		m[2] = new Triangle();

		m[0].move(10, 5);
		m[1].move(1, 2);
		m[0].move(2, 5);
		m[2].move(2, 3);
	}
}
