package test02;

public class Car {
	private int speed;
	private String model;
	private String color;

	///////////////////////////////////////////////////////////////
	public Car() {
//		speed = 0;
//		model = "SONATA";
//		color = "WHITE";
		this(0,"SONATA","WHITE");
	}

	public Car(int speed) {
//		this.speed = speed;
//		model = "SONATA";
//		color = "WHITE";
		this(speed, "SONATA","WHITE");
	}

	public Car(int speed, String model, String color) {
		this.speed = speed;
		this.model = model;
		this.color = color;
	}

	public void speedUp(int speed) {
		this.speed += speed; //���������� �ŰԺ����� �̸��� ��ĥ�� this���
	}
	
	public void printInFo() {
		System.out.println("�ӵ�: "+ speed + "\n����: " + model + "\n����: " + color);
	}
}
