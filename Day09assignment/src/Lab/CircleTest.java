package Lab;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		
		System.out.println("piũ��: " + Circle.getPI());
		System.out.println("���� ����: " + c.getArea());
		System.out.println("���� �ѷ�: " + c.getPerimeter());
	}
}