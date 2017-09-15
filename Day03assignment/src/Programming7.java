import java.util.Scanner;

public class Programming7 {
	public static void main(String[] args) {
		final double Pyeong = 3.3058;
		
		int Pyeongnumber;
		double Pyeongmeter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평수를 입력하시오: ");
		Pyeongnumber = sc.nextInt();
		
		Pyeongmeter = Pyeongnumber * Pyeong;
		
		System.out.println("평방 미터(m^2): " + Pyeongmeter);
		
	}
}
