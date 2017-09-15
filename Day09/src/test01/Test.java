package test01;

public class Test {
	public static void main(String[] args) {
		Car c1 = new Car(); //변수 2개 메소드 5개
		c1.setModel("Sonata");
		c1.setPrice(3000);
		
		Car c2 = new Car();
		c2.setModel("BMW");
		c2.setPrice(4000);
		
		 if(c1.comparePrice(c2)){
			 System.out.println("가격이 같습니다.");
		 }
		 else {
			 System.out.println("가격이 다릅니다.");
		 }

	}
}
