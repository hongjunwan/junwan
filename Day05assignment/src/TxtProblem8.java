import java.util.Scanner;

public class TxtProblem8 {
	public static void main(String[] args) {
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		value = sc.nextInt();
		
		System.out.print("10만큼 큰 수 까지 출력: ");
		
		for(int x = value; x <= value + 10; x++){
			System.out.print(x + " ");
		}
	}
}
