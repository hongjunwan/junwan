package test05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷��� �����մϴ�.");

		try {
			System.out.print("���� 1 �Է� >> ");
			n1 = sc.nextInt();
			System.out.print("���� 2 �Է� >> ");
			n2 = sc.nextInt();

			System.out.println("��: " + (n1 / n2));
			System.out.println("������ :" + (n1 % n2)); // ���� �õ��ϴ� ���и��ϸ� catch�� ����
		} catch (ArithmeticException ex) {
			System.out.println("�ι��� ���ڴ� 0�ȵ�");
		} finally { // �ݵ�� �����ڴ�.
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
