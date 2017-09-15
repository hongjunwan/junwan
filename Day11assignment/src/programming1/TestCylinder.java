package programming1;

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		
		System.out.println("obj1 속성");
		System.out.println("색깔: " + obj1.getColor());
		System.out.println("반지름: " + obj1.getRadius());
		System.out.println("원의 높이: " + obj1.getHeight());
		System.out.println("원의 넓이: " + obj1.getArea());
		System.out.println("원의 부피: " + obj1.getVolume());
	
		System.out.println("obj2 속성");
		System.out.println("색깔: " + obj2.getColor());
		System.out.println("반지름: " + obj2.getRadius());
		System.out.println("원의 높이: " + obj2.getHeight());
		System.out.println("원의 넓이: " + obj2.getArea());
		System.out.println("원의 부피: " + obj2.getVolume());
	}
}
