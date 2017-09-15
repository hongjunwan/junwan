package Programming7;

import java.util.Scanner;

public class AverageTest {
	public static void main(String[] args) {
		int x,y,z;
		
		Average a = new Average();
	
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하시오: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("평균: " + a.getAverage(x, y));
		
		System.out.print("세 정수를 입력하시오: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("평균: " + a.getAverage(x, y, z));
	}
}
