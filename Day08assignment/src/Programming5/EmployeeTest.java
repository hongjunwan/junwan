package Programming5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setName("ȫ�ؿ�");
		e.setPhNumber("010101010");
		e.setAnnualIncome(2000);
		
		System.out.println("�̸�: " + e.getName());
		System.out.println("��ȣ: " + e.getPhNumber());
		System.out.println("����: " + e.getAnnualIncome());
	}
}
