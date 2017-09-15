package Programming2;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p = new Plane();
		Plane p1 = new Plane("에어버스", "A380", 500);

		p.setProduction("에어");
		p.setModel("A");
		p.setPassengersNum(300);

		System.out.println("제작사: " + p.getProduction());
		System.out.println("모델: " + p.getModel());
		System.out.println("승객수: " + p.getPassengersNum());
		System.out.println("제작사: " + p1.getProduction());
		System.out.println("모델: " + p1.getModel());
		System.out.println("승객수: " + p1.getPassengersNum());
		
		System.out.println("생성된 비행기의 개수: " + Plane.getPlanes());
	}
}
