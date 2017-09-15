package test08;

public class Car implements Comparable {
	private int speed;
	private String model;
	private String color;

	public Car(int speed, String model, String color) {
		this.speed = speed;
		this.model = model;
		this.color = color;
	}

	public void printCarInfo() {
		System.out.println("����:" + color + ",�ӵ�:" + speed);
	}

	///////////////////////////////////////////////////
	@Override
	public int compareTo(Object o) {
		int otherSpeed = ((Car) o).speed;
		if (this.speed > otherSpeed) {
			return 1;
		} else if (this.speed < otherSpeed) {
			return -1;
		} else {
			return 0;
		}
	}

}
