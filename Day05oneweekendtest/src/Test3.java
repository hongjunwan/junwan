import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�(10000���� ���� ����): ");
		value = sc.nextInt();
		
		System.out.println("õ�� �ڸ�: " + value / 1000 % 10);
		System.out.println("���� �ڸ�: " + (value / 100) % 10);
		System.out.println("���� �ڸ�: " + (value / 10) % 10);
		System.out.println("���� �ڸ�: " + value % 10);
	}
}
