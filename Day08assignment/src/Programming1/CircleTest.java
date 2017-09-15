package Programming1;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setCx(100);
		c.setCy(50);
		c.setR(3);
		
		System.out.println("cx: " + c.getCx());
		System.out.println("cy: " + c.getCy());
		System.out.println("r: " + c.getR());
		
		System.out.println("¿øÀÇ ³ÐÀÌ: " + c.getArea());
	}
}
