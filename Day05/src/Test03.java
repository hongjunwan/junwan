import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("숫자를 입력하세요: ");
			input = sc.nextInt();
		}while(input != 0);
		System.out.println("프로그램 종료");
	}
}