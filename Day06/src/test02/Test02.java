package test02;

public class Test02 {
	public static void main(String[] args) {
		
		//작성된 Car 클래스 설계가 반영돼 있는 객체 생성
		Car myCar = new Car();
		
		//Car 객체에 있는 변수들에 값 집어넣기
		myCar.speed = 100;
		myCar.model = "BMW";
		myCar.color = "RED";
		
		//Car 객체에 있는 메소드(기능) 실행해보기
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
