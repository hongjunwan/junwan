package test06;

public class Car {
		//멤버변수
		int speed=0; //0으로 초기화 안해도 자동으로 0으로 들어감
		
		//멤버메소드
		void speedUp(int s) {
			int localSpeed=0; //지역 변수 //0으로 초기화 안하면 자동으로 안들어감 오류
			localSpeed += s;
			speed += s;
			System.out.println("local:" + localSpeed + ",speed:" + speed);
		}
}
