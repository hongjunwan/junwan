package test03;

public class Test03 {
	public static void main(String[] args) {
		
		Car firstCar = new Car();
		firstCar.speed = 0;
		firstCar.color = "WHITE";
		firstCar.model = "Sonata";
		
		Car secondCar = new Car();
		secondCar.speed = 100;
		secondCar.color = "BLUE";
		secondCar.model = "520d";
		
		firstCar = secondCar; //이 이후 fistCar의 객체는 삭제됨 garbagecollector가 자동으로 삭제함
		                      //원래 객체로 돌아갈 방법이 없음
		firstCar.printCar();
		
		secondCar = null;
		
		secondCar.printCar();
		
	}
}
