package Programming3;

public class DiceTest {
	public static void main(String[] args) {
		Dice d = new Dice();
		
		d.setFace(2);
		System.out.println("���� �ֻ��� ����: " + d.getFace());
		
		System.out.println("�ֻ��� ������");
		System.out.println("�ֻ��� ����: " + d.roll());
	}
}
