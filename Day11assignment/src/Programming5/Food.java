package Programming5;

public class Food {
	private int calorie;
	private int price;
	private int weight;

	public Food(int calorie, int price, int weight) {
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void printInfo() {
		System.out.print("Į�θ�:" + calorie + "calorie" + " ����:" + weight + "kg" + " ����:" + price + "��");
	}
}