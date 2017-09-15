/*Programming 2번 문제*/

import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {

		int acceptmoney;
		int productprice;
		double surtax;
		int change;

		Scanner inputvalue = new Scanner(System.in);

		System.out.print("받은 돈: ");
		acceptmoney = inputvalue.nextInt();
		System.out.print("상품의 총액: ");
		productprice = inputvalue.nextInt();

		surtax = productprice * 0.1;
		change = acceptmoney - productprice;

		System.out.println("부가세: " + (int) surtax);
		System.out.println("거스름돈: " + change);
	}
}
