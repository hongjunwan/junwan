import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {
		int onehundred;
		int fivehundred;
		int ten;
		int fifty;
		int totalmoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10원의 개수를 입력하시오: ");
		ten = sc.nextInt();
		System.out.print("50원의 개수를 입력하시오: ");
		fifty = sc.nextInt();	
		System.out.print("100원의 개수를 입력하시오: ");
		onehundred = sc.nextInt();
		System.out.print("500원의 개수를 입력하시오: ");
		fivehundred = sc.nextInt();
		
		totalmoney = (ten*10) + (fifty*50) + (onehundred*100) + (fivehundred*500);
		
		System.out.println("총액: " + totalmoney);
	}
}
