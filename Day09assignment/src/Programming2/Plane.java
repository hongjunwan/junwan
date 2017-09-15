package Programming2;

public class Plane {
	private String production;
	private String model;
	private int passengersNum;
	static int planes = 0;

	public Plane() {
		production = " ";
		model = " ";
		passengersNum = 0;
		planes++;
	}

	public Plane(String production, String model, int passengersNum) {
		this.production = production;
		this.model = model;
		this.passengersNum = passengersNum;
		planes++;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPassengersNum(int passengersNum) {
		this.passengersNum = passengersNum;
	}

	public String getProduction() {
		return production;
	}

	public String getModel() {
		return model;
	}

	public int getPassengersNum() {
		return passengersNum;
	}

	public static int getPlanes() {
		return planes;
	}
}
