import java.util.Scanner;

public class Programming6 {
	public static void main(String[] args) {
		int onehundred;
		int fivehundred;
		int ten;
		int fifty;
		int totalmoney;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10���� ������ �Է��Ͻÿ�: ");
		ten = sc.nextInt();
		System.out.print("50���� ������ �Է��Ͻÿ�: ");
		fifty = sc.nextInt();	
		System.out.print("100���� ������ �Է��Ͻÿ�: ");
		onehundred = sc.nextInt();
		System.out.print("500���� ������ �Է��Ͻÿ�: ");
		fivehundred = sc.nextInt();
		
		totalmoney = (ten*10) + (fifty*50) + (onehundred*100) + (fivehundred*500);
		
		System.out.println("�Ѿ�: " + totalmoney);
	}
}
