package test06;

public abstract class Shape {
	private int x, y;

	/////////////////////////////////////////////////////////////
	public Shape() {
		x = y = 0;
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//////////////////////////////////////////////////////////////
	abstract public void draw();

	}
