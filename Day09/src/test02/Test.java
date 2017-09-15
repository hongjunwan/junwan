package test02;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(); // Car()»ý¼ºÀÚ

		c1.printInFo();

		Car c2 = new Car(100);
		c2.printInFo();

		Car c3 = new Car(50, "520d", "RED");
		c3.printInFo();
	}
}
