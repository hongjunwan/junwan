package Programming5;

public class Melon extends Food {
	private String farm;

	public Melon(int calorie, int price, int weight, String farm) {
		super(calorie, price, weight);
		this.farm = farm;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public String toString() {
		super.printInfo();
		return " ³ó¿ø:" + farm;
	}
}
