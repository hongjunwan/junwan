package test03;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.printCarInfo();
		
		c.speedUp(); //매개변수 없는 speedUp메소드가 실행됨
		c.speedUp(); //메개변수 없는 speedUp메소드가 실행됨
		c.speedUp(20);
		
		c.printCarInfo();
	}
}
