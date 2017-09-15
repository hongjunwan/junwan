/*Programming 1번 문제*/

import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		
		double mile;
		double onemile = 1.609;
		double kilometer;

		Scanner inputmile = new Scanner(System.in);

		System.out.print("마일을 입력하시오: ");
		mile = inputmile.nextDouble();

		kilometer = onemile * mile;

		System.out.print(mile + "마일은 " + kilometer + "킬로미터입니다.");
	}
}
