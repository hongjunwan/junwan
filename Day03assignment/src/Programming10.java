import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {
		double AC;
		double AE;
		double BC;
		double DE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("AC�� �Է��Ͻÿ�: ");
		AC = sc.nextDouble();
		System.out.print("AE�� �Է��Ͻÿ�: ");
		AE = sc.nextDouble();
		System.out.print("BC�� �Է��Ͻÿ�: ");
		BC = sc.nextDouble();
		
		DE = BC * AE / AC;
		
		System.out.println("DE��: " + DE);
	}
}
