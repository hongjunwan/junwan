/*Programming 1�� ����*/

import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		
		double mile;
		double onemile = 1.609;
		double kilometer;

		Scanner inputmile = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		mile = inputmile.nextDouble();

		kilometer = onemile * mile;

		System.out.print(mile + "������ " + kilometer + "ų�ι����Դϴ�.");
	}
}
