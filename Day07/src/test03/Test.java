package test03;

//����ڷκ��� 5���� ������ �Է¹޾� �հ�� ����� ���ϴ� ���α׷��� �迭�� ����Ͽ� �ۼ��Ͻÿ�.

import java.util.Scanner;

//public class Test {
//	public static void main(String[] args) {
//		
//		//1.Ȯ�强(���� �迭 ũ�� ����� �Ѳ����� �� ��������)
//		//2.������(�ǹ� ���� ���� ���ڴ�� �̸� �������� ���)
//		final int ARR_SIZE = 10;
//		
//		int sum = 0;
//		double avg;
//		int[] value = new int[ARR_SIZE];
//
//		Scanner sc = new Scanner(System.in);
//		
//		for (int x = 0; x < ARR_SIZE; x++) {
//			System.out.print("������ �Է��Ͻÿ�: ");
//			value[x] = sc.nextInt();
//		}
//
//		for (int x = 0; x < ARR_SIZE; x++) {
//			sum = sum + value[x];
//		}
//		avg = (double)sum / ARR_SIZE;
//		
//		System.out.println("�հ�: " + sum + "\n���: " + avg);
//	}
//}

public class Test {
	public static void main(String[] args) {
		
		int sum = 0;
		double avg;
		int[] value = new int[10];

		Scanner sc = new Scanner(System.in);
		
		for (int x = 0; x < value.length; x++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			value[x] = sc.nextInt();
		}

		for (int x = 0; x < value.length; x++) {
			sum = sum + value[x];
		}
		avg = (double)sum / value.length;
		
		System.out.println("�հ�: " + sum + "\n���: " + avg);
	}
}
