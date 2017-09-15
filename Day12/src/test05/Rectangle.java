package test05;

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
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//////////////////////////////////////////////////////////////////////
	@Override
	public void draw() {
		System.out.println("rectangle draw");
	}
}