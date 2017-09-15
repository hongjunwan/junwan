import java.util.Scanner;

public class TxtProblem6 {
	public static void main(String[] args) {

		int value, result = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수를 입력하시오: ");
			value = sc.nextInt();
			
			if(value <= 0){
				continue;
			}
			
			count++;
			result = result + value;
			
			if(count == 5){
				System.out.println("총 합: " + result);
			}
		}

	}
}
