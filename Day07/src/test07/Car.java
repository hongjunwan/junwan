package test07;

public class Car {
	//�������
	private int speed = 0;
	private String color = "WHITE";
	private String model = "Sonata" ;
	///////////////////////////////////////////
	//����޼ҵ�
	public void printCarInfo() {
		System.out.println("����ӵ�:" + speed);
		System.out.println("����: " + color);
		System.out.println("����: " + model);
	}
	
	public void setInfo(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
	}
}
