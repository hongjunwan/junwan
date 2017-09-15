package test03;

//사용자로부터 5개의 정수를 입력받아 합계와 평균을 구하는 프로그램을 배열을 사용하여 작성하시오.

import java.util.Scanner;

//public class Test {
//	public static void main(String[] args) {
//		
//		//1.확장성(추후 배열 크기 변경시 한꺼번에 싹 변경적용)
//		//2.가독성(의미 유추 힘든 숫자대신 이름 붙혀놓고 사용)
//		final int ARR_SIZE = 10;
//		
//		int sum = 0;
//		double avg;
//		int[] value = new int[ARR_SIZE];
//
//		Scanner sc = new Scanner(System.in);
//		
//		for (int x = 0; x < ARR_SIZE; x++) {
//			System.out.print("정수를 입력하시오: ");
//			value[x] = sc.nextInt();
//		}
//
//		for (int x = 0; x < ARR_SIZE; x++) {
//			sum = sum + value[x];
//		}
//		avg = (double)sum / ARR_SIZE;
//		
//		System.out.println("합계: " + sum + "\n평균: " + avg);
//	}
//}

public class Test {
	public static void main(String[] args) {
		
		int sum = 0;
		double avg;
		int[] value = new int[10];

		Scanner sc = new Scanner(System.in);
		
		for (int x = 0; x < value.length; x++) {
			System.out.print("정수를 입력하시오: ");
			value[x] = sc.nextInt();
		}

		for (int x = 0; x < value.length; x++) {
			sum = sum + value[x];
		}
		avg = (double)sum / value.length;
		
		System.out.println("합계: " + sum + "\n평균: " + avg);
	}
}
