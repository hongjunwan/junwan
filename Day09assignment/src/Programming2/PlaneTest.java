package Programming2;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p = new Plane();
		Plane p1 = new Plane("�������", "A380", 500);

		p.setProduction("����");
		p.setModel("A");
		p.setPassengersNum(300);

		System.out.println("���ۻ�: " + p.getProduction());
		System.out.println("��: " + p.getModel());
		System.out.println("�°���: " + p.getPassengersNum());
		System.out.println("���ۻ�: " + p1.getProduction());
		System.out.println("��: " + p1.getModel());
		System.out.println("�°���: " + p1.getPassengersNum());
		
		System.out.println("������ ������� ����: " + Plane.getPlanes());
	}
}
