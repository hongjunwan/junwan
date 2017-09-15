package Programming5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setName("È«ÁØ¿Ï");
		e.setPhNumber("010101010");
		e.setAnnualIncome(2000);
		
		System.out.println("ÀÌ¸§: " + e.getName());
		System.out.println("¹øÈ£: " + e.getPhNumber());
		System.out.println("¿¬ºÀ: " + e.getAnnualIncome());
	}
}
