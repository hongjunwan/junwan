package Programming3;

public class DiceTest {
	public static void main(String[] args) {
		Dice d = new Dice();
		
		d.setFace(2);
		System.out.println("현재 주사위 숫자: " + d.getFace());
		
		System.out.println("주사위 굴리기");
		System.out.println("주사위 숫자: " + d.roll());
	}
}
