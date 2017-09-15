package Lab;

public class Box {
	private int width;
	private int length;
	private int height;

	public void setWidth(int x) {
		width = x;
	}

	public void setLength(int y) {
		length = y;
	}

	public void setHeight(int z) {
		height = z;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	public int getVolume() {
		return width * length * height;
	}

	public void print() {
		System.out.println("넓이: " + width + " 길이: " + length + " 높이: " + height);
	}
}
