package Programming3;

public class Box {
	private double height;
	private double width;
	private double length;
	private boolean empty = true;

	public Box() {
		height = 0;
		width = 0;
		length = 0;
	}

	public Box(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public String volume() {
		return "상자의 크기: " + (height * length * width);
	}
	
	public void empty() {
		if(empty == true) {
			System.out.println("상자는 비어있습니다.");
		}
		else {
			System.out.println("상자에 물건이 있습니다.");
		}
	}
}
