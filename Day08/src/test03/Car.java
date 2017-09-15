package test03;

public class Car {
	private String color = "WHITE";
	private String model = "Sonata";
	private int speed = 0;
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedUp(int s) { //overloading
		speed += s;
	}
	
	public void speedUp(double s) {
		speed += (int)s;
	}
	public void printCarInfo() {
		System.out.println("Â÷Á¾: " + model + "\n»ö±ò: " + color + "\nspeed: " + speed);
		
	}
}
