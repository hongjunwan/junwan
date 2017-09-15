import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("숫자를 입력하세요: ");
			input = sc.nextInt();
			
			if(input == 0)
				break;
		}
		System.out.println("프로그램 종료");
	}
}