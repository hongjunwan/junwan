package problem18;
class Shape{
	public void draw() {
		System.out.println("¤·");
	}
}
class Circle extends Shape{
	
	public void draw() {
		System.out.println("¤¤");
	}
	public void sayCircle() {
		System.out.println("¤¾µð");
	}
}
public class ClassTest {
	public static void main(String[] args) {
		Shape s = new Circle();
		Circle c = new Circle();
		s.draw();
		c.draw();
		
	}
}
