import java.util.Scanner;

public class Programming9 {
	public static void main(String[] args) {
		int Power;
		int Area;
		int Pressure;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물체에 주어진 힘: ");
		Power = sc.nextInt();
		System.out.print("물체의 면적: ");
		Area = sc.nextInt();
		
		Pressure = Power / Area;
		
		System.out.println("압력의 세기: " + Pressure);
	}
}
