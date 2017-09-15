package test08;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
//		Car c1 = new Car(100,"sonata","RED");
//		Car c2 = new Car(200,"sonata","BLUE");
//		System.out.println(c1.compareTo(c2));
		
		Car[] cars = new Car[5];
		
		cars[0] = new Car(100,"sonata","RED");
		cars[1] = new Car(10,"sonata","YELLO");
		cars[2] = new Car(0,"sonata","BLUE");
		cars[3] = new Car(150,"sonata","ORANGE");
		cars[4] = new Car(40,"sonata","WHITE");
		
		Arrays.sort(cars);
		
		for(Car c:cars) {
			c.printCarInfo();
		}
		
	}
}
