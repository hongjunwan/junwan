package lab2;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] list;
		int sum = 0, count;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("������ ����: ");

			count = sc.nextInt();
			list = new int[count];

			for (int i = 0; i < count; i++) {
				System.out.print("������ �Է��Ͻÿ�: ");
				list[i] = sc.nextInt();
			}
			for (int i = 0; i < count; i++) {
				sum += list[i];
			}
			System.out.println("�����" + sum / count);
		} catch (ArithmeticException e) {
			System.out.println("���� 0 �ȵſ�");
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ�Ⱑ �����Դϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�߸��� �ε��� ���Դϴ�.");
		} catch (NullPointerException e) {
			System.out.println("���������� null�� �ʱ�ȭ �Ǿ� �ֽ��ϴ�.");
		}
	}
}
