package test06;

public class Rectangle extends Shape{
	private int width,height;
	///////////////////////////////////////////////////////////////
	public Rectangle() {
		super(); //x=y=0;
		width = height = 0;
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	//////////////////////////////////////////////////////////////////////
	@Override
	public void draw() {
		System.out.println("rectangle draw");
	}
}
