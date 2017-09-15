package test04;

public class Circle extends Shape{
	private int radius;
	
	public Circle() {
		super();
		radius = 0;
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	///////////////////////////////////////////////////
	@Override
	public void draw() {
		System.out.println("Circle draw....!!");
	}
}
