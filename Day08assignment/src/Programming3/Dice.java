package Programming3;

public class Dice {
	private int face;

	public void setFace(int x) {
		face = x;
	}

	public int getFace() {
		return face;
	}

	public int roll() {
		face = (int) (Math.random() * 6) + 1;
		return face;
	}
}
