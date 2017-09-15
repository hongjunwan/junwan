package test03;

public class Car {
	private int speed;
	private String model;
	private String color;

	///////////////////////////////////////////////////////////////
	public Car() {
		speed = 0;
		model = "SONATA";
		color = "WHITE";
	}

	public Car(int s) {
		speed = s;
		model = "SONATA";
		color = "WHITE";
	}

	public Car(int s, String n, String c) {
		speed = s;
		model = n;
		color = c;
	}

	public void speedUp(int s) {
		speed += s;
	}
	
	public void printInFo() {
		System.out.println("�ӵ�: "+ speed + "\n����: " + model + "\n����: " + color);
	}
}
