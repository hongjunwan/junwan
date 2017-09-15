package test03;

//설계도!! 객체를 생성하기 위한 설계도 작성.
//여기는 main 쓰지 않음

public class Car {
	// 멤버 변수 설계 부분(필드 field)
	int speed;
	String color;
	String model;

	/////////////////////////////////////////////////

	// 멤버 메소드 설계 부분(함수 function == 메소드method)
	void printCar() {

		System.out.println("--현재 차량객체의 정보--");
		System.out.println("--속도 : " + speed);
		System.out.println("--색상 : " + color);
		System.out.println("--차종 : " + model);
		System.out.println("----------------------------");
	}
}
