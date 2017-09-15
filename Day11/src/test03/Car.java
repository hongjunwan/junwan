package test03;

public class Car {
	private int speed;
	private String color;
	private String model;
	///////////////////////////////////////////////////////////////////////////////
	public Car() {
		//this(0,"WHITE","SONATA");
		this.speed = 0;
		this.color = "WHITE";
		this.model = "SONATA";
		System.out.println("Car�� �Ű����� ���� ������");
	}
	
	public Car(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
	}

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
