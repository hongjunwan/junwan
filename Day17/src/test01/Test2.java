package test01;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] numbers = {45,8,2,1,68,5,1,86,6,135};
		
		Arrays.sort(numbers); //���� �迭 �������� ����
		
		for(int n: numbers) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.binarySearch(numbers, 68)); // �̼��� ������ ������ ���� ��ġ -2
		
		Arrays.fill(numbers, 9);
		
		for(int n: numbers) {
			System.out.println(n + " ");
		}
	}
}
