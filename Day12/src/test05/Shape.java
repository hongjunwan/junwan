package test05;

public class Shape {
	private int x,y;
	/////////////////////////////////////////////////////////////
	public Shape() {
		x = y = 0;
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//////////////////////////////////////////////////////////////
	public void draw() {
		System.out.println("Shape draw....?");
	}
}
