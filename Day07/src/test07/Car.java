package test07;

public class Car {
	//멤버변수
	private int speed = 0;
	private String color = "WHITE";
	private String model = "Sonata" ;
	///////////////////////////////////////////
	//멤버메소드
	public void printCarInfo() {
		System.out.println("현재속도:" + speed);
		System.out.println("색상: " + color);
		System.out.println("차종: " + model);
	}
	
	public void setInfo(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
	}
}
