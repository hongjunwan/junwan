package Programming2;

public class Customer extends Person {
	private String customerNumber;
	private int mileage;

	public Customer() {
		super();
		customerNumber = "123213";
		mileage = 10;
	}
	
	public Customer(String name, String adress, String phoneNumber) {
		super(name,adress,phoneNumber);
		customerNumber = "1213";
		mileage = 20;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
