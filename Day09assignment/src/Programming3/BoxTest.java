package Programming3;

public class BoxTest {
	public static void main(String[] args) {
		
		Box b = new Box();
		Box b1 = new Box(2.0,2.0,3.0);
		
		b.setHeight(10);
		b.setLength(5);
		b.setWidth(10);
		
		System.out.println("b�� ����: " + b.getHeight());
		System.out.println("b�� ����: " + b.getWidth());
		System.out.println("b�� ����: " + b.getLength());
		System.out.println("b1�� ����: " + b1.getHeight());
		System.out.println("b1�� ����: " + b1.getWidth());
		System.out.println("b1�� ����: " + b1.getLength());
		
		System.out.println("b�� " + b.volume());
		System.out.println("b1�� " + b1.volume());
		
		System.out.print("b���� ����: ");
		b.empty();
		System.out.print("b1���� ����: ");
		b1.empty();	
	}
}
