package test02;

//����ڷκ��� 5���� ������ �Է¹޾� �հ�� ����� ���ϴ� ���α׷��� �迭�� ����Ͽ� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int sum = 0;
		double avg;
		int[] value;
		value = new int[5];

		Scanner sc = new Scanner(System.in);
		
		for (int x = 0; x < 5; x++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			value[x] = sc.nextInt();
		}

		for (int x = 0; x < 5; x++) {
			sum = sum + value[x];
		}
		avg = (double)sum / 5;
		
		System.out.println("�հ�: " + sum + "\n���: " + avg);
	}
}
