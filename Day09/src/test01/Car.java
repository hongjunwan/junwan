package test01;

public class Car {
	private int price;
	private String model;
	//////////////////////////////////////////////////////////
	public void setPrice(int p) {
		price = p;	
	}
	public int getPrice() {
		return price;
	}
	public void setModel(String n) {
		model = n;
	}
	public String getModel() {
		return model;
	}
	///////////////////////////////////////////////////////////
	public boolean comparePrice(Car other) { //Car other: ���� ����
		if(price == other.price) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
