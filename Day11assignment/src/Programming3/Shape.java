package Programming3;

public class Shape {
	private int x, y;
	private double size;
	
	public Shape() {
		 x = 2;
	     y = 2;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	public void getArea(double size) {
		this.size = size;
	}
	
	public void getCircumference(double size) {
		this.size = size;
	}
	public void location() {
		System.out.println("위치 x:"+x+" 위치 y:"+y);
	}
}
