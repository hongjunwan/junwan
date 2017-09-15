package Lab;

public class Circle {
	private double radius;
	private static double PI = 3.141592;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	private double square() {
		return (radius * radius);
	}
	private double square(double radius) {
		return (radius * radius);
	}
	public double getArea() {
		return (PI * square());
	}
	public double getPerimeter() {
		return (2 * PI * radius);
	}
	
	public static double getPI() {
		return PI;
	}
	
//	public static void main(String[] args) {
//		square(10.0);
//	}
// 7) 오류 발생 - 객체를 생성해야 함수를 실행 할 수 있음.   
}
