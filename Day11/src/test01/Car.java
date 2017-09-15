package test01;

public class Car {
	private int speed;
	private String color;
	private String model;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void speedUp() {
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
	}

	public void printCarInfo() {
		System.out.println("�ӵ�:" + speed);
		System.out.println("����:" + color);
		System.out.println("����:" + model);
	}
}
