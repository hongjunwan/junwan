import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오(10000보다 작은 정수): ");
		value = sc.nextInt();
		
		System.out.println("천의 자리: " + value / 1000 % 10);
		System.out.println("백의 자리: " + (value / 100) % 10);
		System.out.println("십의 자리: " + (value / 10) % 10);
		System.out.println("일의 자리: " + value % 10);
	}
}
