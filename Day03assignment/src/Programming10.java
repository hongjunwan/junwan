import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {
		double AC;
		double AE;
		double BC;
		double DE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("AC를 입력하시오: ");
		AC = sc.nextDouble();
		System.out.print("AE를 입력하시오: ");
		AE = sc.nextDouble();
		System.out.print("BC를 입력하시오: ");
		BC = sc.nextDouble();
		
		DE = BC * AE / AC;
		
		System.out.println("DE는: " + DE);
	}
}
