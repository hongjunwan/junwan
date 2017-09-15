package Programming1;

public class Circle {
	private int r;
	private int cx, cy;

	public void setR(int x) {
		r = x;
	}

	public void setCx(int x) {
		cx = x;
	}

	public void setCy(int x) {
		cy = x;
	}

	public int getR() {
		return r;
	}

	public int getCx() {
		return cx;
	}

	public int getCy() {
		return cy;
	}

	public double getArea() {
		return (r * r * 3.1415);
	}

}
