package test02;

public class Test02 {
	public static void main(String[] args) {
		
		//�ۼ��� Car Ŭ���� ���谡 �ݿ��� �ִ� ��ü ����
		Car myCar = new Car();
		
		//Car ��ü�� �ִ� �����鿡 �� ����ֱ�
		myCar.speed = 100;
		myCar.model = "BMW";
		myCar.color = "RED";
		
		//Car ��ü�� �ִ� �޼ҵ�(���) �����غ���
		myCar.printCar();
		
		myCar.speed = 200;
		myCar.model = "BMW";
		myCar.color = "RED";
		
		myCar.printCar();
	    ///////////////////////////////////////////////
		Car secondCar = new Car();
		
		secondCar.speed = 0;
		secondCar.model = "AUDI";
		secondCar.color = "WHITE";
		
		secondCar.printCar();
		myCar.printCar();
	}
}
