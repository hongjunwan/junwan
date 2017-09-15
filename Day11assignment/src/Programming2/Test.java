package Programming2;

public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer("김왕직", "태평", "102");
		
		System.out.println("c1의 속성");
		System.out.println("이름: " + c1.getName());
		System.out.println("주소: " + c1.getAdress());
		System.out.println("전화 번호: " + c1.getPhoneNumber());
		System.out.println("고객 번호: " + c1.getCustomerNumber());
		System.out.println("마일리지: " + c1.getMileage());
		
		System.out.println("c2의 속성");
		System.out.println("이름: " + c2.getName());
		System.out.println("주소: " + c2.getAdress());
		System.out.println("전화 번호: " + c2.getPhoneNumber());
		System.out.println("고객 번호: " + c2.getCustomerNumber());
		System.out.println("마일리지: " + c2.getMileage());
	}
}
