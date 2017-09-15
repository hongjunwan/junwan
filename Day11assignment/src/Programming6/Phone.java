package Programming6;

public class Phone {
	private String productCompany;
	private int price;
	private String communicationType;

	public Phone(String productCompany, int price, String communicationType) {
		this.productCompany = productCompany;
		this.price = price;
		this.communicationType = communicationType;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	public void printInfo() {
		System.out.println("제조사:" + productCompany + " 가격:" + price + "원" + " 통신타입:" + communicationType);
	}
}
