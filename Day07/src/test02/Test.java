package test02;

//사용자로부터 5개의 정수를 입력받아 합계와 평균을 구하는 프로그램을 배열을 사용하여 작성하시오.

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		int sum = 0;
		double avg;
		int[] value;
		value = new int[5];

		Scanner sc = new Scanner(System.in);
		
		for (int x = 0; x < 5; x++) {
			System.out.print("정수를 입력하시오: ");
			value[x] = sc.nextInt();
		}

		for (int x = 0; x < 5; x++) {
			sum = sum + value[x];
		}
		avg = (double)sum / 5;
		
		System.out.println("합계: " + sum + "\n평균: " + avg);
	}
}
