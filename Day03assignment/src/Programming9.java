import java.util.Scanner;

public class Programming9 {
	public static void main(String[] args) {
		int Power;
		int Area;
		int Pressure;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ü�� �־��� ��: ");
		Power = sc.nextInt();
		System.out.print("��ü�� ����: ");
		Area = sc.nextInt();
		
		Pressure = Power / Area;
		
		System.out.println("�з��� ����: " + Pressure);
	}
}
