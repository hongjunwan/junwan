package programming1;

public class Die {
	private int diceSide;

	public Die() {
		diceSide = 1;
	}

	public int roll() {
		diceSide = (int) ((Math.random() * 6) +1);
		return diceSide;
	}
	
	public void setValue(int v) {
		diceSide = v;
	}
	
	public int getValue() {
		return diceSide;
	}
	
	public String toString() {
		return "���� �ֻ��� ���� " + diceSide + "�� �Դϴ�";
	}
}
