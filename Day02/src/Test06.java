import java.util.Scanner;

/*원의 둘레 넓이*/

public class Test06 {
	public static void main(String[] args) {
		
		double pi = 3.14; //파이 값
		double r; //원의 반지름
		double round; //둘레
		double width; //넓이
			
		Scanner inputr = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		r = inputr.nextDouble(); //자료형이 double이라서 nextDouble
   
		round = 2 * pi * r; //원의 둘레 계산 공식
		width = pi * r * r; //원의 넓이 계산 공식
		
		System.out.printf("원의 둘레는: %f\n", round);
		System.out.printf("원의 넓이는: %f", width);
	}
}
