package test03;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.printCarInfo();
		
		c.speedUp(); //�Ű����� ���� speedUp�޼ҵ尡 �����
		c.speedUp(); //�ް����� ���� speedUp�޼ҵ尡 �����
		c.speedUp(20);
		
		c.printCarInfo();
	}
}
